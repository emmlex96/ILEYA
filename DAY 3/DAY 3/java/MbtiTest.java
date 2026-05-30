import java.util.Scanner;

public class MbtiTest {

static String[][] questions = {
    {"expend energy, enjoy groups", "conserve energy, enjoy one-on-one"},
    {"Interpret literally", "look for meaning and possibilities"},
    {"logical, thinking, questioning", "empathetic, feeling, accommodating"},
    {"organized, orderly", "flexible, adaptable"},
    {"more outgoing, think out loud", "more reserved, think to yourself"},
    {"practical, realistic, experiential", "imaginative, innovative, theoretical"},
    {"candid, straight forward, frank", "tactful, kind, encouraging"},
    {"plan, schedule", "unplanned, spontaneous"},
    {"seek many tasks, public activities, interaction with others", "seek private, solitary activities with quiet to concentrate"},
    {"standard, usual, conventional", "different, novel, unique"},
    {"firm, tend to criticize, hold the line", "gentle, tend to appreciate, conciliate"},
    {"regulated, structured", "easy-going, live and let live"},
    {"external, communicative, express yourself", "internal, reticent, keep to yourself"},
    {"focus on here-and-now", "look to the future, global perspective, big picture"},
    {"tough-minded, just", "tender-hearted, merciful"},
    {"preparation, plan ahead", "go with the flow, adapt as you go"},
    {"active, initiate", "reflective, deliberate"},
    {"facts, things, what is", "ideas, dreams, what could be, philosophical"},
    {"matter of fact, issue-oriented", "sensitive, people-oriented, compassionate"},
    {"control, govern", "latitude, freedom"}
};

static int[][] groups = {
    {0, 4, 8, 12, 16},
    {1, 5, 9, 13, 17},
    {2, 6, 10, 14, 18},
    {3, 7, 11, 15, 19}
};

static String[][] groupLetters = {{"E", "I"}, {"S", "N"}, {"T", "F"}, {"J", "P"}};

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] responses = new char[20];

    System.out.print("What is your name: ");
    String name = sc.nextLine();

    for (int i = 0; i < questions.length; i++) {
        while (true) {
            System.out.printf("%nA. %-55s B. %s%n", questions[i][0], questions[i][1]);
            System.out.print("Expected A or B as Response: ");
            String input = sc.nextLine().trim().toUpperCase();
            if (input.equals("A") || input.equals("B")) {
                responses[i] = input.charAt(0);
                break;
            }
            System.out.println("I know this is an error, Please retry again");
        }
    }

    System.out.printf("%nHello %s, You selected:%n", name);

    StringBuilder mbti = new StringBuilder();

    for (int g = 0; g < groups.length; g++) {
        int aCount = 0;
        System.out.println();
        for (int idx : groups[g]) {
            char chosen = responses[idx];
            if (chosen == 'A') {
                System.out.println("  A. " + questions[idx][0]);
                aCount++;
            } else {
                System.out.println("  B. " + questions[idx][1]);
            }
        }
        int bCount = groups[g].length - aCount;
        System.out.println("Number of A selected: " + aCount);
        System.out.println("Number of B selected: " + bCount);
        mbti.append(aCount >= bCount ? groupLetters[g][0] : groupLetters[g][1]);
    }

    String type = mbti.toString();
    System.out.println("\n" + type);
    printPersonality(type);

    sc.close();
}

static void printPersonality(String type) {
    String nickname, description;
    switch (type) {
        case "INTJ": nickname = "Architect";     description = "Strategic, independent thinker driven by logic and long-term planning."; break;
        case "INTP": nickname = "Logician";      description = "Innovative inventor with a thirst for knowledge and abstract thinking."; break;
        case "ENTJ": nickname = "Commander";     description = "Bold, imaginative leader who loves challenges and long-term goals."; break;
        case "ENTP": nickname = "Debater";       description = "Smart, curious thinker who loves intellectual challenges."; break;
        case "INFJ": nickname = "Advocate";      description = "Quiet visionary, often inspiring, with tireless idealism."; break;
        case "INFP": nickname = "Mediator";      description = "Poetic, kind and altruistic, always eager to help a good cause."; break;
        case "ENFJ": nickname = "Protagonist";   description = "Charismatic leader, passionate about helping others grow."; break;
        case "ENFP": nickname = "Campaigner";    description = "Enthusiastic, creative, sociable free spirit who thrives on connections."; break;
        case "ISTJ": nickname = "Logistician";   description = "Practical and fact-minded, reliable and dutiful."; break;
        case "ISFJ": nickname = "Defender";      description = "Dedicated protector, warm and caring, always ready to defend loved ones."; break;
        case "ESTJ": nickname = "Executive";     description = "Excellent administrator, unsurpassed at managing things and people."; break;
        case "ESFJ": nickname = "Consul";        description = "Caring, social and popular, always eager to help."; break;
        case "ISTP": nickname = "Virtuoso";      description = "Bold, practical experimenter, master of all kinds of tools."; break;
        case "ISFP": nickname = "Adventurer";    description = "Flexible, charming artist, always ready to explore new things."; break;
        case "ESTP": nickname = "Entrepreneur";  description = "Smart, energetic and perceptive, truly enjoys living on the edge."; break;
        case "ESFP": nickname = "Entertainer";   description = "Spontaneous, energetic and enthusiastic — life is never boring around them."; break;
        default:     nickname = "Unknown";       description = "Type not found."; break;
    }
    System.out.println(nickname);
    System.out.println("The " + nickname + " (" + type + ")");
    System.out.println("\n" + description);
}


}
