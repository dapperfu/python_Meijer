package com.scandit.datacapture.core.internal.sdk.feedback;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import com.scandit.datacapture.core.common.feedback.Sound;
import com.scandit.datacapture.core.common.feedback.Vibration;
import com.scandit.datacapture.core.common.feedback.WaveFormVibration;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.extensions.SoundPoolExtensionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class b implements FeedbackEmitter {

    /* renamed from: j, reason: collision with root package name */
    public static final HandlerThread f125478j;

    /* renamed from: k, reason: collision with root package name */
    public static final Handler f125479k;

    /* renamed from: a, reason: collision with root package name */
    public final Vibration f125480a;

    /* renamed from: b, reason: collision with root package name */
    public final Sound f125481b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f125482c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f125483d;

    /* renamed from: e, reason: collision with root package name */
    public SoundPool f125484e;

    /* renamed from: f, reason: collision with root package name */
    public int f125485f;

    /* renamed from: g, reason: collision with root package name */
    public final AudioManager f125486g;

    /* renamed from: h, reason: collision with root package name */
    public final Vibrator f125487h;

    /* renamed from: i, reason: collision with root package name */
    public final int f125488i;

    public static final void a(b this$0, SoundPool soundPool, SoundPool soundPool2, int i10, int i11) {
        Intrinsics.j(this$0, "this$0");
        if (Intrinsics.e(this$0.f125484e, soundPool)) {
            this$0.f125482c = true;
            this$0.c();
        }
    }

    public static final void b(b this$0) {
        Intrinsics.j(this$0, "this$0");
        this$0.getClass();
        a();
        if (this$0.f125482c) {
            return;
        }
        if (this$0.f125481b == null) {
            this$0.f125482c = true;
            return;
        }
        SoundPool soundPoolB = this$0.b();
        this$0.f125484e = soundPoolB;
        this$0.f125485f = SoundPoolExtensionsKt.load(soundPoolB, AppAndroidEnvironment.INSTANCE.getApplicationContext(), this$0.f125481b);
    }

    public final void c() {
        AudioManager audioManager;
        SoundPool soundPool;
        AudioManager audioManager2;
        if (this.f125483d && this.f125482c) {
            if (this.f125480a != null && this.f125487h != null && this.f125488i == 0 && ((audioManager2 = this.f125486g) == null || audioManager2.getRingerMode() != 0)) {
                long jAsMillis = this.f125480a.getDuration().asMillis();
                int amplitude = this.f125480a.getAmplitude();
                if (Build.VERSION.SDK_INT >= 26) {
                    Vibration vibration = this.f125480a;
                    WaveFormVibration waveFormVibration = vibration instanceof WaveFormVibration ? (WaveFormVibration) vibration : null;
                    this.f125487h.vibrate(waveFormVibration != null ? waveFormVibration.getAmplitudes() != null ? VibrationEffect.createWaveform(waveFormVibration.getTimings(), waveFormVibration.getAmplitudes(), -1) : VibrationEffect.createWaveform(waveFormVibration.getTimings(), -1) : VibrationEffect.createOneShot(jAsMillis, amplitude));
                } else {
                    this.f125487h.vibrate(jAsMillis);
                }
            }
            if (this.f125485f != 0 && this.f125484e != null && (audioManager = this.f125486g) != null && audioManager.getRingerMode() == 2 && (soundPool = this.f125484e) != null) {
                soundPool.play(this.f125485f, 1.0f, 1.0f, 1, 0, 1.0f);
            }
            this.f125483d = false;
        }
    }

    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        new Object(defaultConstructorMarker) { // from class: com.scandit.datacapture.core.internal.sdk.feedback.FeedbackEmitterImpl$Companion
        };
        HandlerThread handlerThread = new HandlerThread("thread-feedback");
        handlerThread.start();
        f125478j = handlerThread;
        f125479k = new Handler(handlerThread.getLooper());
    }

    public b(Vibration vibration, Sound sound, Context context) {
        Intrinsics.j(context, "context");
        this.f125480a = vibration;
        this.f125481b = sound;
        Object systemService = context.getSystemService("audio");
        Vibrator defaultVibrator = null;
        this.f125486g = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (Build.VERSION.SDK_INT >= 31) {
            Object systemService2 = context.getSystemService("vibrator_manager");
            VibratorManager vibratorManagerA = e.a(systemService2) ? f.a(systemService2) : null;
            if (vibratorManagerA != null) {
                defaultVibrator = vibratorManagerA.getDefaultVibrator();
            }
        } else {
            Object systemService3 = context.getSystemService("vibrator");
            if (systemService3 instanceof Vibrator) {
                defaultVibrator = (Vibrator) systemService3;
            }
        }
        this.f125487h = defaultVibrator;
        this.f125488i = context.getPackageManager().checkPermission("android.permission.VIBRATE", context.getPackageName());
    }

    @Override // com.scandit.datacapture.core.internal.sdk.feedback.FeedbackEmitter
    public final void emitAsync() {
        f125479k.post(new Runnable() { // from class: com.scandit.datacapture.core.internal.sdk.feedback.h
            @Override // java.lang.Runnable
            public final void run() {
                b.a(this.f125489a);
            }
        });
    }

    @Override // com.scandit.datacapture.core.internal.sdk.feedback.FeedbackEmitter
    public final void loadAsync() {
        f125479k.post(new Runnable() { // from class: com.scandit.datacapture.core.internal.sdk.feedback.j
            @Override // java.lang.Runnable
            public final void run() {
                b.b(this.f125491a);
            }
        });
    }

    @Override // com.scandit.datacapture.core.internal.sdk.feedback.FeedbackEmitter
    public final void releaseAsync() {
        f125479k.post(new Runnable() { // from class: com.scandit.datacapture.core.internal.sdk.feedback.i
            @Override // java.lang.Runnable
            public final void run() {
                b.c(this.f125490a);
            }
        });
    }

    public static final void a(b this$0) {
        Intrinsics.j(this$0, "this$0");
        this$0.getClass();
        a();
        this$0.f125483d = true;
        this$0.c();
    }

    public static void a() {
        Intrinsics.e(Thread.currentThread(), f125478j);
    }

    public final SoundPool b() {
        final SoundPool soundPoolBuild = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(14).setContentType(4).build()).setMaxStreams(2).build();
        soundPoolBuild.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: com.scandit.datacapture.core.internal.sdk.feedback.k
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i10, int i11) {
                b.a(this.f125492a, soundPoolBuild, soundPool, i10, i11);
            }
        });
        Intrinsics.i(soundPoolBuild, "apply(...)");
        return soundPoolBuild;
    }

    public static final void c(b this$0) {
        Intrinsics.j(this$0, "this$0");
        this$0.getClass();
        a();
        SoundPool soundPool = this$0.f125484e;
        if (soundPool != null) {
            soundPool.setOnLoadCompleteListener(null);
        }
        SoundPool soundPool2 = this$0.f125484e;
        if (soundPool2 != null) {
            soundPool2.release();
        }
        this$0.f125484e = null;
        this$0.f125485f = 0;
        this$0.f125482c = false;
        this$0.f125483d = false;
    }
}
