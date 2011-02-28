package net.mogoweb.nativeskia;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.Log;
import android.view.View;

public class SkiaView extends View
{
    private static final String TAG = "nativeskia";

    private int mSampleId = 0;

    static
    {
        System.loadLibrary("nativeskia");
    }

    public native void renderHello(Canvas canvas);
    public native void renderText(Canvas canvas);
    public native void renderImage(Canvas canvas);

    public SkiaView(Context context)
    {
        super(context);

        setBackgroundColor(Color.WHITE);
    }

    public SkiaView(Context context, int sampleId)
    {
        this(context);
        mSampleId = sampleId;
    }

    @Override
    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);

        switch (mSampleId)
        {
        case 0:
            Log.d(TAG, "render hello");
            renderHello(canvas);
            break;
        case 1:
            Log.d(TAG, "render text");
            renderText(canvas);
            break;
        case 2:
            Log.d(TAG, "render image");
            renderImage(canvas);
            break;
        default:
            break;
        }
    }

}
