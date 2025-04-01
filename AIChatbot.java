import java.util.*;

// Abstract chatbot structure (Abstraction)
abstract class ChatbotBase {
    protected String botName = "AI Mental Health Chatbot";

    public abstract String getResponse(String mood) throws InvalidMoodException;
}

// Mood response generator with dynamic questions (Inheritance)
class MoodResponseGenerator extends ChatbotBase {
    private final Map<String, String> moodResponses;
    private final Map<String, List<String>> followUpQuestions;
    private final Map<String, String> signOffMessages;

    // Constructor (Encapsulation)
    public MoodResponseGenerator() {
        moodResponses = new HashMap<>();
        moodResponses.put("happy", "That's great! Keep spreading positive vibes! 😊");
        moodResponses.put("sad", "It's okay to feel sad sometimes. I'm here for you.");
        moodResponses.put("angry", "Take a deep breath. Count to 10. You are in control.");
        moodResponses.put("stressed", "Deep breaths! Try the 4-7-8 breathing method.");
        moodResponses.put("anxious", "You're not alone. Focus on your surroundings and breathe.");

        followUpQuestions = new HashMap<>();
        followUpQuestions.put("happy", Arrays.asList(
            "What made you happy today? 😃",
            "Have you shared your happiness with someone?",
            "What’s one thing that always lifts your mood?",
            "How do you usually celebrate happy moments?",
            "What’s a goal that excites you right now?"
        ));
        followUpQuestions.put("sad", Arrays.asList(
            "Do you want to talk about what’s making you sad? 😔",
            "Have you tried doing something you love to lift your mood?",
            "Is there a friend or family member you can talk to?",
            "Would you like some tips to feel better?",
            "What’s one thing that brought you comfort recently?"
        ));
        followUpQuestions.put("angry", Arrays.asList(
            "What’s making you angry right now? 😡",
            "Do you usually vent your anger or keep it inside?",
            "Have you tried relaxation techniques?",
            "Would you like a simple breathing exercise?",
            "What’s something that helps you cool down?"
        ));
        followUpQuestions.put("stressed", Arrays.asList(
            "What’s been causing you stress lately? 😵",
            "Have you taken a break to relax today?",
            "Do you have a hobby that helps you unwind?",
            "Would you like a simple mindfulness tip?",
            "What’s one thing you can do right now to feel calmer?"
        ));
        followUpQuestions.put("anxious", Arrays.asList(
            "What’s making you anxious right now? 😟",
            "Have you tried grounding techniques like 5-4-3-2-1?",
            "What’s a happy memory that calms you?",
            "Would you like a simple breathing exercise?",
            "Who is someone you trust that you can talk to?"
        ));

        // Personalized sign-offs (Encapsulation)
        signOffMessages = new HashMap<>();
        signOffMessages.put("happy", "Keep smiling! Your happiness is contagious. 🌟");
        signOffMessages.put("sad", "You are stronger than you think. Don't hesitate to reach out to someone. ❤️");
        signOffMessages.put("angry", "Stay calm and in control. A peaceful mind makes better decisions. ✨");
        signOffMessages.put("stressed", "Take it one step at a time. You’ve got this! 💪");
        signOffMessages.put("anxious", "You're doing better than you think. Breathe and believe in yourself. 💙");
    }

    // Overridden method (Polymorphism)
    @Override
    public String getResponse(String mood) throws InvalidMoodException {
        if (mood == null || mood.trim().isEmpty()) {
            throw new InvalidMoodException("Mood cannot be empty. Please enter a valid mood.");
        }
        return moodResponses.getOrDefault(mood.toLowerCase(), "I didn't understand that mood. Can you rephrase?");
    }

    public List<String> getFollowUpQuestions(String mood) {
        return followUpQuestions.getOrDefault(mood.toLowerCase(), new ArrayList<>());
    }

    public String getSignOffMessage(String mood) {
        return signOffMessages.getOrDefault(mood.toLowerCase(), "Take care! You are not alone. Have a great day!");
    }
}

// Custom exception class
class InvalidMoodException extends Exception {
    public InvalidMoodException(String message) {
        super(message);
    }
}

// AI Chatbot class
public class AIChatbot extends MoodResponseGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AIChatbot chatbot = new AIChatbot();

        System.out.println("🤖 Welcome to the AI Mental Health Chatbot!");
        System.out.println("Type 'exit' anytime to stop.\n");

        while (true) {
            try {
                System.out.println("\nHow are you feeling today? (Happy, Sad, Angry, Stressed, Anxious)");
                System.out.print("You: ");
                String userMood = scanner.nextLine().trim();

                if (userMood.equalsIgnoreCase("exit")) {
                    System.out.println("Chatbot: Take care! You are not alone. Have a great day! 😊");
                    break;
                }

                // Get chatbot response
                String response = chatbot.getResponse(userMood);
                System.out.println("Chatbot: " + response);

                // Ask follow-up questions
                List<String> questions = chatbot.getFollowUpQuestions(userMood);
                int questionCount = Math.min(questions.size(), 5); // Limit to 5 questions

                for (int i = 0; i < questionCount; i++) {
                    System.out.println("Chatbot: " + questions.get(i));
                    System.out.print("You: ");
                    String userAnswer = scanner.nextLine().trim();

                    // If user wants to exit
                    if (userAnswer.equalsIgnoreCase("exit")) {
                        System.out.println("Chatbot: " + chatbot.getSignOffMessage(userMood));
                        return;
                    }

                    // Acknowledge the user's answer and build interaction
                    if (i == 0) {
                        System.out.println("Chatbot: That sounds important. Tell me more.");
                    } else if (i == 1) {
                        System.out.println("Chatbot: I see. That makes sense.");
                    } else if (i == 2) {
                        System.out.println("Chatbot: Interesting! I appreciate you sharing.");
                    } else if (i == 3) {
                        System.out.println("Chatbot: You're doing great. I'm here for you.");
                    } else {
                        System.out.println("Chatbot: That’s a great insight! Stay positive.");
                    }
                }

                // Provide a proper sign-off message
                System.out.println("Chatbot: " + chatbot.getSignOffMessage(userMood));

            } catch (InvalidMoodException e) {
                System.out.println("⚠️ Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
