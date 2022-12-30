package com.had0uken.english.enums;

//Enum with all English levels according to CEFR standard (Common European Framework of Reference for Languages)
public enum Level {
    A1("Beginner",  "Can understand and use familiar everyday expressions and very basic phrases aimed" +
            " at the satisfaction of needs of a concrete type. Can introduce themselves and others and can ask and" +
            " answer questions about personal details such as where someone lives, people they know and things they" +
            " have. Can interact in a simple way provided the other person talks slowly and clearly and is prepared" +
            " to help."),
    A2("Elementary English","Can understand sentences and frequently used expressions related to areas" +
            " of most immediate relevance (e.g. very basic personal and family information, shopping, local " +
            "geography, employment). Can communicate in simple and routine tasks requiring a simple and direct " +
            "exchange of information on familiar and routine matters. Can describe in simple terms aspects of " +
            "their background immediate environment and matters in areas of immediate need.\n" +
            "\n"),
    B1("Intermediate English","Can understand the main points of clear standard input on familiar " +
            "matters regularly encountered in work, school, leisure, etc. Can deal with most situations likely to " +
            "arise while travelling in an area where the language is spoken. Can produce simple connected text on " +
            "topics which are familiar or of personal interest. Can describe experiences and events, dreams, " +
            "hopes & ambitions and briefly give reasons and explanations for opinions and plans."),
    B2("Upper-Intermediate English","Can understand the main ideas of complex text on both" +
            " concrete and abstract topics, including technical discussions in their field of specialisation." +
            " Can interact with a degree of fluency and spontaneity that makes regular interaction with users" +
            " of the target language quite possible without imposing strain on either party. Can produce clear," +
            " detailed text on a wide range of subjects and explain a viewpoint on a topical issue giving the" +
            " advantages and disadvantages of various options."),
    C1("Advanced English","Can understand a wide range of demanding, longer texts, and recognise " +
            "implicit meaning. Can express themselves fluently and spontaneously without much obvious searching for " +
            "expressions. Can use language flexibly and effectively for social, academic and professional purposes. " +
            "Can produce clear, well-structured, detailed text on complex subjects, showing controlled use of " +
            "organisational patterns, connectors and cohesive devices."),
    C2("Proficiency English","Can understand virtually all types of texts. Can summarise information " +
            "from different oral and written sources, reconstructing arguments and accounts in a coherent " +
            "presentation. Can express themselves spontaneously, very fluently and precisely, differentiating " +
            "finer shades of meaning even in more complex situations.");

    private String level;
    private String description;

    Level(String level, String description) {
        this.level = level;
        this.description = description;
    }

    public String getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }
}