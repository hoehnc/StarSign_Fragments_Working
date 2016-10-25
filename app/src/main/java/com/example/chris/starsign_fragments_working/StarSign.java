package com.example.chris.starsign_fragments_working;

/**
 * Created by Chris on 10/24/2016.
 */
public class StarSign {
    private String name;
    private String description;

    public static  final StarSign[] starSigns = {
            new StarSign("Aries","March 21 - April 19/n/nRomantic relationships may not exactly be going as well as you'd like, Aries, but don't get discouraged. Hang in there and you will find that things eventually come around your way. You may need to strengthen your internal sense of confidence, since it's doubtful that you will get much support from interactions with the people around you."),
            new StarSign("Taurus","April 20 - May 20/n/nIt could be that you're trying to communicate with someone in a matter regarding love and romance and it simply isn't working. You're apt to feel like you need a translator in order to get your message across. Both you and your partner need to share responsibility for making sure that the lines of communication remain open. Be practical yet sensitive in your approach."),
            new StarSign("Gemini","May 21 - June 20/n/nThis is a fantastic time for you for love and romance, Gemini, even if there's a bit of coolness between you and the person you care about. It's possible that there needs to be an element of distance now for you to really appreciate the good thing you have. If you aren't involved with someone now, you should find that you're in a good position to make a move toward someone you feel strongly about."),
            new StarSign("Cancer","June 21 - July 22/n/nIt's one thing to be a friend and it's another to feed someone's ego just to make him or her happy, Cancer. Make sure that you aren't telling someone lies just because you know that that is what he or she wants to hear. A true friend is someone who is honest at all times, even if it means that you may temporarily hurt that person's feelings."),
            new StarSign("Leo","July 32 - August 22/n/nIt's critical that you not try to gain the love and appreciation of another by controlling their decisions, Leo. It's time to let the people around you set their own rules and boundaries. Give that special person space to decide what's best, then you can take action accordingly. It may be that you discover things about this person that you probably would never have known if you called all the shots."),
            new StarSign("Virgo","August 23 - September 21/n/nYou might need to put on the brakes today when it comes to love and romance, Virgo. Don't think that this means you have to break off any sort relationship that's in the works, but realize that you may need to take a more realistic approach to how you handle it. The problem is that you may be getting so caught up in the fantasy of things that you aren't tending to practicalities."),
            new StarSign("Libra","September 22 - October 23/n/nThings should be going quite well for you today, Libra, and you will find that aspects of your life that may have felt disconnected in the past are finally slipping into place. Have faith that all your painstaking planning and organizing is finally going to pay off. This is especially true in love and romance. Spend intimate time with a close partner tonight."),
            new StarSign("Scorpio","October 24 - November 21/n/nRestriction and discipline might not be your forte, Scorpio, but realize that this may be exactly the type of thing that you need the most. Try not to expend your energy in too many directions. Focus and channel your efforts into the things you consider the most important. Make sure that most of your day is spent tending to these things. Have you hugged your loved ones lately?"),
            new StarSign("Sagittarius","November 22 - December 21/n/nAppreciate the good things you have today, Sagittarius. Don't let another day go by without really paying homage to the people who've helped you grow along the way. Take a walk. Climb a tree or help a child build a tree house. Connect with your spiritual side that finds satisfaction in where you are now instead of always feeling a need to search for something bigger and better."),
            new StarSign("Capricorn","December 22 - January 19/n/nWhen it comes to matters of love and romance, you may need to tone things down a bit, Capricorn. An aggressive approach now may drive your loved one further away from you instead of drawing him or her closer. Remember that love is a two-way street. Don't just do things the way you'd like to do them. It's crucial that you consider your partner's thoughts and feelings every step of the way."),
            new StarSign("Aquarius","January 20 - February 18/n/nYou may find that your love is incredibly magnetic now, Aquarius. All you need to do is be yourself and suddenly people flock your way. There are terrific opportunities for you to strengthen the bonds you have with the people you care about the most. Solidify your relationship with soft romantic words and actions. There is an extra sensuality to your mood and actions now."),
            new StarSign("Pisces","February 19 - March 20/n/nConsider taking a more conservative approach to your actions today, Pisces, as well as to the way you dress. Others may be rather put off by something that comes across as too flashy. Fashion is apt to be a significant concern for you now, which is fine. Don't underestimate the power of personal appearance.")
    };

    private StarSign(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return  this.name;
    }
}
