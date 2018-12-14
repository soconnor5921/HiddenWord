public class HiddenWord
{
    private String word;

    public HiddenWord(String word)
    {
        this.word = word;
    }

    public String getHint(String guess)
    {
        String hint = "";
        if(guess.equals(word))
        {
            return word;
        }
        else
        {
            for(int i = 0; i < word.length(); i++)
            {
                if(guess.substring(i, i+1).equals(word.substring(i,i+1)))
                {
                    hint += guess.substring(i, i+1);
                }
                else if(word.indexOf(guess.substring(i, i+1)) > -1)
                {
                    hint += "+";
                }
                else
                {
                    hint += "*";
                }
            }
            return hint;
        }
    }
}
