package e.promptnow5.liveat500px.manager;

import android.content.Context;

/**
 * Created by PromptNow5 on 1/3/2018.
 */

public class Contextor {

    private static Contextor instance;

    public static Contextor getInstance() {
        if (instance == null)
            instance = new e.promptnow5.liveat500px.manager.Contextor();
        return instance;
    }

    private Context mContext;

    private Contextor() {

    }

    public void init(Context context) {
        mContext = context;
    }

    public Context getContext() {
        return mContext;
    }

}