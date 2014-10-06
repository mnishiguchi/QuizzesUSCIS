package com.mnishiguchi.android.quizzesuscis;

import java.util.ArrayList;

/**
 * A Quiz object represents a pair of question and answer.
 * The static fields deal with a set of one hundred quizzes (questions and answers).
 */
public class Quiz
{
    // CLASS VARIABLE
    private static ArrayList<Quiz> sQuizzes = new ArrayList<Quiz>(100);
    private static ArrayList<String> sQuestions = new ArrayList<String>(100);
    private static ArrayList<String> sAnswers = new ArrayList<String>(100);
    
    // INSTANCE VARIABLE
    private String mQuestion;
    private String mAnswer;
    
    /** CONSTRUCTOR */
    public Quiz(String question, String answer)
    {
        this.mQuestion = question;
        this.mAnswer = answer;
    }

    public String getAnswer()
    {
        return mAnswer;
    }

    public String getQuestion()
    {
        return mQuestion;
    }
    
    /**
     * @return an ArrayList<String> of quiz questions.
     */
    static ArrayList<String> getQuestions()
    {
        // Check if the array is empty.
        if (!sQuestions.isEmpty() ) return sQuestions;
        
        sQuizzes = Quiz.getQuizzes();
        for (Quiz q : sQuizzes)
        { 
            sQuestions.add(q.mQuestion);
        }
        return sQuestions;
    }
    
    /**
     * @return an answer string for the specified quiz number.
     */  
    static String getAnswer(int index)
    {
        return Quiz.getAnswers().get(index);
    }
    
    /**
     * @return an ArrayList<String> of quiz answers.
     */
    static ArrayList<String> getAnswers()
    {
        // Check if the array is empty.
        if (!sAnswers.isEmpty() ) return sAnswers;
        
        sQuizzes = Quiz.getQuizzes();
        for (Quiz q : sQuizzes)
        {
            sAnswers.add(q.mAnswer);
        }
        return sAnswers;
    }
    
    /**
     * @return a Quiz object of the specified quiz index.
     */
    static Quiz getQuiz(int index)
    {
        return Quiz.getQuizzes().get(index);
    }
    
    /**
     * @return One hundred quizzes as an ArrayList of Quiz objects.
     */
    static ArrayList<Quiz> getQuizzes()
    {
        // Check if the array is empty.
        if (!sQuizzes.isEmpty() ) return sQuizzes;
        
        // Initialize the array.
        sQuizzes.add(new Quiz("1. What is the supreme law of the land?",
                "the Constitution"));
        sQuizzes.add(new Quiz("2. What does the Constitution do?",
                "sets up the government | defines the government | protects basic rights of Americans"));
        sQuizzes.add(new Quiz("3. The idea of self-government is in the first three words of the Constitution. What are these words?",
                "We the People"));
        sQuizzes.add(new Quiz("4. What is an amendment?",
                "a change (to the Constitution)"));
        sQuizzes.add(new Quiz("5. What do we call the first ten amendments to the Constitution?",
                "the Bill of Rights"));
        sQuizzes.add(new Quiz("6. What is one right or freedom from the First Amendment?",
                "speech | religion | assembly | press | petition the government"));
        sQuizzes.add(new Quiz("7. How many amendments does the Constitution have?",
                "twenty-seven (27)"));
        sQuizzes.add(new Quiz("8. What did the Declaration of Independence do?",
                "announced our independence (from Great Britain) | " +
                "declared our independence (from Great Britain) | " +
                "said that the United States is free (from Great Britain)"));
        sQuizzes.add(new Quiz("9. What are two rights in the Declaration of Independence?",
                "life | liberty | pursuit of happiness"));
        sQuizzes.add(new Quiz("10. What is freedom of religion?",
                "You can practice any religion, or not practice a religion."));
        sQuizzes.add(new Quiz("11. What is the economic system in the United States?",
                "capitalist economy | market economy"));
        sQuizzes.add(new Quiz("12. What is the Ågrule of lawÅh?",
                "Everyone must follow the law. | Leaders must obey the law. | Government must obey the law. | No one is above the law."));
        sQuizzes.add(new Quiz("13. Name one branch or part of the government.",
                "Congress | legislative | President | executive | the courts | judicial"));
        sQuizzes.add(new Quiz("14. What stops one branch of government from becoming too powerful?",
                "checks and balances | separation of powers"));
        sQuizzes.add(new Quiz("15. Who is in charge of the executive branch?",
                "the President"));
        sQuizzes.add(new Quiz("16. Who makes federal laws?",
                "Congress | Senate and House (of Representatives) | (U.S. or national) legislature"));
        sQuizzes.add(new Quiz("17. What are the two parts of the U.S. Congress?",
                "the Senate and House (of Representatives)"));
        sQuizzes.add(new Quiz("18. How many U.S. Senators are there?",
                "one hundred (100)"));
        sQuizzes.add(new Quiz("19. We elect a U.S. Senator for how many years?",
                "six (6)"));
        sQuizzes.add(new Quiz("20. Who is one of your stateÅfs U.S. Senators now?",
                "Answers will vary. [District of Columbia residents and residents of U.S. territories should answer " +
                "that D.C. (or the territory where the applicant lives) has no U.S. Senators.]"));
        sQuizzes.add(new Quiz("21. The House of Representatives has how many voting members?",
                "four hundred thirty-five (435)"));
        sQuizzes.add(new Quiz("22. We elect a U.S. Representative for how many years?",
                "two (2)"));
        sQuizzes.add(new Quiz("23. Name your U.S. Representative.",
                "Answers will vary. [Residents of territories with nonvoting Delegates or " +
                "Resident Commissioners may provide the name of that Delegate or Commissioner.  " +
                "Also acceptable is any statement that the territory has  no (voting) Representatives in Congress.]"));
        sQuizzes.add(new Quiz("24. Who does a U.S. Senator represent?",
                "all people of the state"));
        sQuizzes.add(new Quiz("25. Why do some states have more Representatives than other states?",
                "(because of) the stateÅfs population | (because) they have more people | (because) some states have more people"));
        sQuizzes.add(new Quiz("26. We elect a President for how many years?",
                "four (4)"));
        sQuizzes.add(new Quiz("27. In what month do we vote for President?",
                "November"));
        sQuizzes.add(new Quiz("28. What is the name of the President of the United States now?",
                "Barack Obama"));
        sQuizzes.add(new Quiz("29. What is the name of the Vice President of the United States now?",
                "Joseph R. Biden, Jr. | Joe Biden"));
        sQuizzes.add(new Quiz("30. If the President can no longer serve, who becomes President?",
                "the Vice President"));
        sQuizzes.add(new Quiz("31. If both the President and the Vice President can no longer serve, who becomes President?",
                "the Speaker of the House"));
        sQuizzes.add(new Quiz("32. Who is the Commander in Chief of the military?",
                "the President"));
        sQuizzes.add(new Quiz("33. Who signs bills to become laws?",
                "the President"));
        sQuizzes.add(new Quiz("34. Who vetoes bills?",
                "the President"));
        sQuizzes.add(new Quiz("35. What does the PresidentÅfs Cabinet do?",
                "advises the President"));
        sQuizzes.add(new Quiz("36. What are two Cabinet-level positions?",
                "Secretary of Agriculture | Secretary of Commerce | Secretary of Defense | " +
                "Secretary of Education | Secretary of Energy | Secretary of Health and Human Services | " +
                "Secretary of Homeland Security | Secretary of Housing and Urban Development | " +
                "Secretary of the Interior | Secretary of Labor | Secretary of State | " +
                "Secretary of Transportation | Secretary of the Treasury | Secretary of Veterans Affairs | " +
                "Attorney General | Vice President"));
        sQuizzes.add(new Quiz("37. What does the judicial branch do?",
                "reviews laws | explains laws | resolves disputes (disagreements) | decides if a law goes against the Constitution"));
        sQuizzes.add(new Quiz("38. What is the highest court in the United States?",
                "the Supreme Court"));
        sQuizzes.add(new Quiz("39. How many justices are on the Supreme Court?",
                "nine (9)"));
        sQuizzes.add(new Quiz("40. Who is the Chief Justice of the United States now?",
                "John Roberts (John G. Roberts, Jr.)"));
        sQuizzes.add(new Quiz("41. Under our Constitution, some powers belong to the federal government. What is one power of the federal government?",
                "to print money | to declare war | to create an army | to make treaties"));
        sQuizzes.add(new Quiz("42. Under our Constitution, some powers belong to the states. What is one power of the states? ",
                "provide schooling and education | provide protection (police) | provide safety (fire departments) | " +
                "give a driverÅfs license | approve zoning and land use"));
        sQuizzes.add(new Quiz("43. Who is the Governor of your state now?",
                "Answers will vary. [District of Columbia residents should answer that D.C. does not have a Governor.]"));
        sQuizzes.add(new Quiz("44. What is the capital of your state?",
                "Answers will vary. [District of Columbia residents should answer that D.C. is not a state " +
                "and does not have a capital. Residents of U.S. territories should name the capital of the territory.]"));
        sQuizzes.add(new Quiz("45. What are the two major political parties in the United States?",
                "Democratic and Republican"));
        sQuizzes.add(new Quiz("46. What is the political party of the President now?",
                "Democratic (Party)"));
        sQuizzes.add(new Quiz("47. What is the name of the Speaker of the House of Representatives now?",
                "(John) Boehner"));
        sQuizzes.add(new Quiz("48. There are four amendments to the Constitution about who can vote. Describe one of them.",
                "Citizens eighteen (18) and older (can vote). | You donÅft have to pay (a poll tax) to vote. | " +
                "Any citizen can vote. (Women and men can vote.) | A male citizen of any race (can vote)."));
        sQuizzes.add(new Quiz("49. What is one responsibility that is only for United States citizens?",
                "serve on a jury|vote in a federal election"));
        sQuizzes.add(new Quiz("50. Name one right only for United States citizens.",
                "vote in a federal election | run for federal office"));
        sQuizzes.add(new Quiz("51. What are two rights of everyone living in the United States?",
                "freedom of expression | freedom of speech | freedom of assembly | " +
                "freedom to petition the government | freedom of worship | the right to bear arms"));
        sQuizzes.add(new Quiz("52. What do we show loyalty to when we say the Pledge of Allegiance?",
                "the United States | the flag"));
        sQuizzes.add(new Quiz("53. What is one promise you make when you become a United States citizen?",
                "give up loyalty to other countries | defend the Constitution and laws of the United States | " +
                "obey the laws of the United States | serve in the U.S. military (if needed) | " +
                "serve (do important work for) the nation (if needed) | be loyal to the United States"));
        sQuizzes.add(new Quiz("54. How old do citizens have to be to vote for President?",
                "eighteen (18) and older"));
        sQuizzes.add(new Quiz("55. What are two ways that Americans can participate in their democracy?",
                "vote | join a political party | help with a campaign | join a civic group | " +
                "join a community group | give an elected official your opinion on an issue | " +
                "call Senators and Representatives | publicly support or oppose an issue or policy | " +
                "run for office | write to a newspaper"));
        sQuizzes.add(new Quiz("56. When is the last day you can send in federal income tax forms?",
                "April 15"));
        sQuizzes.add(new Quiz("57. When must all men register for the Selective Service?",
                "at age eighteen (18) | between eighteen (18) and twenty-six (26)"));
        sQuizzes.add(new Quiz("58. What is one reason colonists came to America?",
                "freedom | political liberty | religious freedom | economic opportunity | practice their religion | escape persecution"));
        sQuizzes.add(new Quiz("59. Who lived in America before the Europeans arrived?",
                "American Indians | Native Americans"));
        sQuizzes.add(new Quiz("60. What group of people was taken to America and sold as slaves?",
                "Africans | people from Africa"));
        sQuizzes.add(new Quiz("61. Why did the colonists fight the British?",
                "because of high taxes (taxation without representation) | " +
                "because the British army stayed in their houses (boarding, quartering) | because they didnÅft have self-government"));
        sQuizzes.add(new Quiz("62. Who wrote the Declaration of Independence?",
                "(Thomas) Jefferson"));
        sQuizzes.add(new Quiz("63. When was the Declaration of Independence adopted?",
                "July 4, 1776"));
        sQuizzes.add(new Quiz("64. There were 13 original states. Name three.",
                "New Hampshire | Massachusetts | Rhode Island | Connecticut | New York | New Jersey | " +
                "Pennsylvania | Delaware | Maryland | Virginia | North Carolina | South Carolina | Georgia"));
        sQuizzes.add(new Quiz("65. What happened at the Constitutional Convention?",
                "The Constitution was written. | The Founding Fathers wrote the Constitution."));
        sQuizzes.add(new Quiz("66. When was the Constitution written?",
                "1787"));
        sQuizzes.add(new Quiz("67. The Federalist Papers supported the passage of the U.S. Constitution. Name one of the writers.",
                "(James) Madison | (Alexander) Hamilton | (John) Jay | Publius"));
        sQuizzes.add(new Quiz("68. What is one thing Benjamin Franklin is famous for?",
                "U.S. diplomat | oldest member of the Constitutional Convention | first Postmaster General of the United States | " +
                "writer of ÅgPoor RichardÅfs AlmanacÅh | started the first free libraries"));
        sQuizzes.add(new Quiz("69. Who is the ÅgFather of Our CountryÅh?",
                "(George) Washington"));
        sQuizzes.add(new Quiz("70. Who was the first President?",
                "(George) Washington"));
        sQuizzes.add(new Quiz("71. What territory did the United States buy from France in 1803?",
                "the Louisiana Territory | Louisiana"));
        sQuizzes.add(new Quiz("72. Name one war fought by the United States in the 1800s.",
                "War of 1812 | Mexican-American War | Civil War | Spanish-American War"));
        sQuizzes.add(new Quiz("73. Name the U.S. war between the North and the South.",
                "the Civil War | the War between the States"));
        sQuizzes.add(new Quiz("74. Name one problem that led to the Civil War.",
                "slavery | economic reasons | statesÅf rights"));
        sQuizzes.add(new Quiz("75. What was one important thing that Abraham Lincoln did?",
                "freed the slaves (Emancipation Proclamation) | saved (or preserved) the Union | led the United States during the Civil War"));
        sQuizzes.add(new Quiz("76. What did the Emancipation Proclamation do?",
                "freed the slaves | freed slaves in the Confederacy | freed slaves in the Confederate states | " +
                "freed slaves in most Southern states"));
        sQuizzes.add(new Quiz("77. What did Susan B. Anthony do?",
                "fought for womenÅfs rights | fought for civil rights"));
        sQuizzes.add(new Quiz("78. Name one war fought by the United States in the 1900s.",
                "World War I | World War II | Korean War | Vietnam War | (Persian) Gulf War"));
        sQuizzes.add(new Quiz("79. Who was President during World War I?",
                "(Woodrow) Wilson"));
        sQuizzes.add(new Quiz("80. Who was President during the Great Depression and World War II? ",
                "(Franklin) Roosevelt"));
        sQuizzes.add(new Quiz("81. Who did the United States fight in World War II?",
                "Japan, Germany, and Italy"));
        sQuizzes.add(new Quiz("82. Before he was President, Eisenhower was a general. What war was he in?",
                "World War II"));
        sQuizzes.add(new Quiz("83. During the Cold War, what was the main concern of the United States?",
                "Communism"));
        sQuizzes.add(new Quiz("84. What movement tried to end racial discrimination?",
                "civil rights (movement)"));
        sQuizzes.add(new Quiz("85. What did Martin Luther King, Jr. do?",
                "fought for civil rights | worked for equality for all Americans"));
        sQuizzes.add(new Quiz("86. What major event happened on September 11, 2001, in the United States?",
                "Terrorists attacked the United States."));
        sQuizzes.add(new Quiz("87. Name one American Indian tribe in the United States.",
                "[USCIS Officers will be supplied with a list of federally recognized American Indian tribes.] " +
                "Cherokee | Navajo | Sioux | Chippewa | Choctaw | Pueblo | Apache | Iroquois | Creek | " +
                "Blackfeet | Seminole | Cheyenne | Arawak | Shawnee | Mohegan | Huron | Oneida | " +
                "Lakota | Crow | Teton | Hopi | Inuit"));
        sQuizzes.add(new Quiz("88. Name one of the two longest rivers in the United States.",
                "Missouri (River) | Mississippi (River)"));
        sQuizzes.add(new Quiz("89. What ocean is on the West Coast of the United States?",
                "Pacific (Ocean)"));
        sQuizzes.add(new Quiz("90. What ocean is on the East Coast of the United States?",
                "Atlantic (Ocean)"));
        sQuizzes.add(new Quiz("91. Name one U.S. territory.",
                "Puerto Rico | U.S. Virgin Islands | American Samoa | Northern Mariana Islands | Guam"));
        sQuizzes.add(new Quiz("92. Name one state that borders Canada.",
                "Maine | New Hampshire | Vermont | New York | Pennsylvania | Ohio | Michigan | " +
                "Minnesota | North Dakota | Montana | Idaho | Washington | Alaska"));
        sQuizzes.add(new Quiz("93. Name one state that borders Mexico.",
                "California | Arizona | New Mexico | Texas"));
        sQuizzes.add(new Quiz("94. What is the capital of the United States?",
                "Washington, D.C."));
        sQuizzes.add(new Quiz("95. Where is the Statue of Liberty?",
                "New York (Harbor)Liberty Island " +
                "[Also acceptable are New Jersey, near New York City, and on the Hudson (River).]"));
        sQuizzes.add(new Quiz("96. Why does the flag have 13 stripes?",
                "because there were 13 original colonies | because the stripes represent the original colonies"));
        sQuizzes.add(new Quiz("97. Why does the flag have 50 stars?",
                "because there is one star for each state | because each star represents a state | because there are 50 states"));
        sQuizzes.add(new Quiz("98. What is the name of the national anthem?",
                "The Star-Spangled Banner"));
        sQuizzes.add(new Quiz("99. When do we celebrate Independence Day?",
                "July 4"));
        sQuizzes.add(new Quiz("100. Name two national U.S. holidays.",
                "New YearÅfs Day | Martin Luther King, Jr. Day | PresidentsÅf Day | Memorial Day | Independence Day | " +
                "Labor Day | Columbus Day | Veterans Day | Thanksgiving | Christmas"));
        return sQuizzes;
    }
    
}
