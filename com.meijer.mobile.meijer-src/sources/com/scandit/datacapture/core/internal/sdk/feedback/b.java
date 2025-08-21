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

/* loaded from: classes12.dex */
public final class b implements FeedbackEmitter {

    /* renamed from: j, reason: collision with root package name */
    public static final HandlerThread f126430j;

    /* renamed from: k, reason: collision with root package name */
    public static final Handler f126431k;

    /* renamed from: a, reason: collision with root package name */
    public final Vibration f126432a;

    /* renamed from: b, reason: collision with root package name */
    public final Sound f126433b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f126434c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f126435d;

    /* renamed from: e, reason: collision with root package name */
    public SoundPool f126436e;

    /* renamed from: f, reason: collision with root package name */
    public int f126437f;

    /* renamed from: g, reason: collision with root package name */
    public final AudioManager f126438g;

    /* renamed from: h, reason: collision with root package name */
    public final Vibrator f126439h;

    /* renamed from: i, reason: collision with root package name */
    public final int f126440i;

    public static final void a(b this$0, SoundPool soundPool, SoundPool soundPool2, int i10, int i11) {
        Intrinsics.j(this$0, "this$0");
        if (Intrinsics.e(this$0.f126436e, soundPool)) {
            this$0.f126434c = true;
            this$0.c();
        }
    }

    public static final void b(b this$0) {
        Intrinsics.j(this$0, "this$0");
        this$0.getClass();
        a();
        if (this$0.f126434c) {
            return;
        }
        if (this$0.f126433b == null) {
            this$0.f126434c = true;
            return;
        }
        SoundPool soundPoolB = this$0.b();
        this$0.f126436e = soundPoolB;
        this$0.f126437f = SoundPoolExtensionsKt.load(soundPoolB, AppAndroidEnvironment.INSTANCE.getApplicationContext(), this$0.f126433b);
    }

    public final void c() {
        AudioManager audioManager;
        SoundPool soundPool;
        AudioManager audioManager2;
        if (this.f126435d && this.f126434c) {
            if (this.f126432a != null && this.f126439h != null && this.f126440i == 0 && ((audioManager2 = this.f126438g) == null || audioManager2.getRingerMode() != 0)) {
                long jAsMillis = this.f126432a.getDuration().asMillis();
                int amplitude = this.f126432a.getAmplitude();
                if (Build.VERSION.SDK_INT >= 26) {
                    Vibration vibration = this.f126432a;
                    WaveFormVibration waveFormVibration = vibration instanceof WaveFormVibration ? (WaveFormVibration) vibration : null;
                    this.f126439h.vibrate(waveFormVibration != null ? waveFormVibration.getAmplitudes() != null ? VibrationEffect.createWaveform(waveFormVibration.getTimings(), waveFormVibration.getAmplitudes(), -1) : VibrationEffect.createWaveform(waveFormVibration.getTimings(), -1) : VibrationEffect.createOneShot(jAsMillis, amplitude));
                } else {
                    this.f126439h.vibrate(jAsMillis);
                }
            }
            if (this.f126437f != 0 && this.f126436e != null && (audioManager = this.f126438g) != null && audioManager.getRingerMode() == 2 && (soundPool = this.f126436e) != null) {
                soundPool.play(this.f126437f, 1.0f, 1.0f, 1, 0, 1.0f);
            }
            this.f126435d = false;
        }
    }

    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        new Object(defaultConstructorMarker) { // from class: com.scandit.datacapture.core.internal.sdk.feedback.FeedbackEmitterImpl$Companion
        };
        HandlerThread handlerThread = new HandlerThread("thread-feedback");
        handlerThread.start();
        f126430j = handlerThread;
        f126431k = new Handler(handlerThread.getLooper());
    }

    public b(Vibration vibration, Sound sound, Context context) {
        Intrinsics.j(context, "context");
        this.f126432a = vibration;
        this.f126433b = sound;
        Object systemService = context.getSystemService("audio");
        Vibrator defaultVibrator = null;
        this.f126438g = systemService instanceof AudioManager ? (AudioManager) systemService : null;
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
        this.f126439h = defaultVibrator;
        this.f126440i = context.getPackageManager().checkPermission("android.permission.VIBRATE", context.getPackageName());
    }

    @Override // com.scandit.datacapture.core.internal.sdk.feedback.FeedbackEmitter
    public final void emitAsync() {
        f126431k.post(new Runnable() { // from class: com.scandit.datacapture.core.internal.sdk.feedback.h
            @Override // java.lang.Runnable
            public final void run() {
                b.a(this.f126441a);
            }
        });
    }

    @Override // com.scandit.datacapture.core.internal.sdk.feedback.FeedbackEmitter
    public final void loadAsync() {
        f126431k.post(new Runnable() { // from class: com.scandit.datacapture.core.internal.sdk.feedback.j
            @Override // java.lang.Runnable
            public final void run() {
                b.b(this.f126443a);
            }
        });
    }

    @Override // com.scandit.datacapture.core.internal.sdk.feedback.FeedbackEmitter
    public final void releaseAsync() {
        f126431k.post(new Runnable() { // from class: com.scandit.datacapture.core.internal.sdk.feedback.i
            @Override // java.lang.Runnable
            public final void run() {
                b.c(this.f126442a);
            }
        });
    }

    public static final void a(b this$0) {
        Intrinsics.j(this$0, "this$0");
        this$0.getClass();
        a();
        this$0.f126435d = true;
        this$0.c();
    }

    public static void a() {
        Intrinsics.e(Thread.currentThread(), f126430j);
    }

    public final SoundPool b() {
        final SoundPool soundPoolBuild = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(14).setContentType(4).build()).setMaxStreams(2).build();
        soundPoolBuild.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: com.scandit.datacapture.core.internal.sdk.feedback.k
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i10, int i11) {
                b.a(this.f126444a, soundPoolBuild, soundPool, i10, i11);
            }
        });
        Intrinsics.i(soundPoolBuild, "apply(...)");
        return soundPoolBuild;
    }

    public static final void c(b this$0) {
        Intrinsics.j(this$0, "this$0");
        this$0.getClass();
        a();
        SoundPool soundPool = this$0.f126436e;
        if (soundPool != null) {
            soundPool.setOnLoadCompleteListener(null);
        }
        SoundPool soundPool2 = this$0.f126436e;
        if (soundPool2 != null) {
            soundPool2.release();
        }
        this$0.f126436e = null;
        this$0.f126437f = 0;
        this$0.f126434c = false;
        this$0.f126435d = false;
    }
}
