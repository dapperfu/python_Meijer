package Eg;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Vibrator;
import com.fullstory.FS;
import java.io.IOException;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    private static final String f8984d = "e";

    /* renamed from: a, reason: collision with root package name */
    private final Context f8985a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8986b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8987c = false;

    @SuppressLint({"MissingPermission"})
    public synchronized void d() {
        Vibrator vibrator;
        try {
            if (this.f8986b) {
                c();
            }
            if (this.f8987c && (vibrator = (Vibrator) this.f8985a.getSystemService("vibrator")) != null) {
                vibrator.vibrate(200L);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static /* synthetic */ boolean b(MediaPlayer mediaPlayer, int i10, int i11) throws IllegalStateException {
        FS.log_w(f8984d, "Failed to beep " + i10 + ", " + i11);
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        return true;
    }

    public MediaPlayer c() throws IllegalStateException, Resources.NotFoundException, IOException, IllegalArgumentException {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: Eg.c
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) throws IllegalStateException {
                e.a(mediaPlayer2);
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: Eg.d
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i10, int i11) {
                return e.b(mediaPlayer2, i10, i11);
            }
        });
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f8985a.getResources().openRawResourceFd(m.f9026a);
            try {
                mediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                assetFileDescriptorOpenRawResourceFd.close();
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                mediaPlayer.start();
                return mediaPlayer;
            } catch (Throwable th2) {
                assetFileDescriptorOpenRawResourceFd.close();
                throw th2;
            }
        } catch (IOException e10) {
            FS.log_w(f8984d, e10);
            mediaPlayer.reset();
            mediaPlayer.release();
            return null;
        }
    }

    public void e(boolean z10) {
        this.f8986b = z10;
    }

    public e(Activity activity) {
        activity.setVolumeControlStream(3);
        this.f8985a = activity.getApplicationContext();
    }

    public static /* synthetic */ void a(MediaPlayer mediaPlayer) throws IllegalStateException {
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
    }
}
