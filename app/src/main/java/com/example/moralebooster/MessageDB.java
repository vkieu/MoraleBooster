package com.example.moralebooster;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class MessageDB {
    private MessageDB() {
        //noop
    }

    private final static String[] messages = new String[]{
            "You're so good. If you claimed 2nd place, no one dare to claim the first.",
            "“What could we accomplish if we knew we could not fail?“ – Eleanor Roosevelt",
            "“You don’t have to see the whole staircase, just take the first step.” – Martin Luther King, Jr.",
            "“The sun itself is weak when it first rises, and gathers strength and courage as the day gets on.” – Charles Dickens",
            "“Once we believe in ourselves, we can risk curiosity, wonder, spontaneous delight, or any experience that reveals the human spirit.” – E.E. Cummings",
            "“Talent wins games, but teamwork and intelligence win championships.” – Michael Jordan",
            "“The truth is that you always know the right thing to do. The tough part is doing it.” – General Norman Schwarzkopf, U.S. Army.",
            "“When we strive to become better than we are, everything around us becomes better too.” – Paulo Coelho",
            "“We sleep peaceably in our beds at night only because rough men stand ready to do violence on our behalf.” – George Orwell",
            "“Courage is the most important of all the virtues because without courage, you can’t practice any other virtue consistently.” – Maya Angelou",
            "“In the middle of difficulty lies opportunity.” – Albert Einstein",
            "“The best way out is always through.” – Robert Frost",
            "“You never know how strong you are, until being strong is your only choice.” – Bob Marley",
            "“Well done is better than well said.” – Benjamin Franklin",
            "“A hero can be anyone. Even a man doing something as simple and reassuring as putting a coat around a young boy’s shoulders to let him know that the world hadn’t ended.” – Bruce Wayne",
            "“You don’t always need a plan. Sometimes you just need to breathe, trust, let go and see what happens.” – Mandy Hale",
            "“Strength does not come from physical capacity. It comes from an indomitable will.” – Mahatma Gandhi",
            "“The best way to predict your future is to create it.” – Abraham Lincoln",
            "“I like the dreams of the future better than the history of the past.” – Thomas Jefferson",


            "“If you’re going through hell, keep going.” – Winston Churchill",

            "“There are two ways of exerting one’s strength: one is pushing down, the other is pulling up.” – Booker T. Washington",

            "“There are two ways of exerting one’s strength: one is pushing down, the other is pulling up.” – Booker T. Washington",

            "“I could either watch it happen or be a part of it.” – Elon Musk",

            "“The secret of getting ahead is getting started.” – Mark Twain",

            " “Doing the best at this moment puts you in the best place for the next moment.” – Oprah Winfrey",

            "“Courage doesn’t always roar. Sometimes courage is the little voice at the end of the day that says I’ll try again tomorrow.” – Mary Anne Radmacher",

            " “Everything you’ve ever wanted is on the other side of fear.” – George Addai",


            "“As long as they are well-intentioned, mistakes are not a matter for shame, but for learning.” – Margaret Heffernan",

            " “Strength shows not only in the ability to persist but in the ability to start over.” – F. Scott Fitzgerald",

            "“There are far better things ahead than we ever leave behind.” – C.S. Lewis",

            " “Attempt the impossible in order to improve your work.” – Bette Davis",

            "“We are what we repeatedly do. Excellence, then, is not an act, but a habit.” – Aristotle",

            "“Always be a first-rate version of yourself, instead of a second-rate version of somebody else.” – Judy Garland",

            "“The truth of the matter is that you always know the right thing to do. The hard part is doing it.” – Robert H. Schuller",

            "“You wouldn’t worry so much about what others think of you if you realized how seldom they do.” – Eleanor Roosevelt",

            "“Intelligence without ambition is a bird without wings.” – Salvador Dali",

            "“Amateurs sit and wait for inspiration, the rest of us just get up and go to work.” – Stephen King",

            "“What the caterpillar calls the end of the world, the master calls a butterfly.” – Richard Bach",

            "“The greatest glory in living lies not in never falling, but in rising every time we fail.” – Nelson Mandela",

            "“You don’t have to be great to start, but you have to start to be great.” – Zig Ziglar",

            "“When everything seems to be going against you, remember that the airplane takes off against the wind, not with it.” – Henry Ford",
            "“Courage is what it takes to stand up and speak. Courage is also what it takes to sit down and listen.” – Winston Churchill",
            "“I find that the harder I work, the more luck I seem to have.” – Thomas Jefferson",

            "“The ultimate measure of a man is not where he stands in moments of comfort and convenience but where he stands in times of challenge and controversy.” – Martin Luther King Jr.",

            "“Have the courage to follow your heart and intuition. They somehow already know what you truly want to become. Everything else is secondary.” – Steve Jobs",

            "“In a world that’s changing really quickly, the only strategy that is guaranteed to fail is not taking risks.” – Mark Zuckerberg",

            "“How wonderful it is that nobody need wait a single moment before starting to improve the world.” – Anne Frank",

            "“Do the best you can. No one can do more than that.” – John Wooden",
            "“If you think you’re too small to make a difference, try sleeping with a mosquito.” – Dalai Lama",

            "“I now tried a new hypothesis: It was possible that I was more in charge of my happiness than I was allowing myself to be.” – Michelle Obama",

            "“Stop being a prisoner of your past. Become an architect of your future.” – Robin Sharma",

            "“Nothing is impossible, the word itself says “I’m possible!” – Audrey Hepburn",
            "“A competent leader can get efficient service from poor troops, while on the contrary, an incapable leader can demoralize the best of troops.” – John J. Pershing",
    };

    private static MessageStatsHolder holder = new MessageStatsHolder();
    private static AtomicInteger numberOfTotalCalls = new AtomicInteger(0);

    public static int getNumberOfTotalCalls() {
        return numberOfTotalCalls.get();
    }

    public static MessageStats getNextRandomMessage() {
        numberOfTotalCalls.addAndGet(1);
        Random random = new Random();
        int index = random.nextInt(messages.length);
        String message = messages[index];
        return holder.getMessageStats(message);
    }
}
