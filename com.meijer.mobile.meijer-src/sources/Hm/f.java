package Hm;

import android.os.CountDownTimer;
import java.text.DecimalFormat;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0003R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"LHm/f;", "", "<init>", "()V", "", "millisUntilFinished", "", "h", "(J)Ljava/lang/String;", "timerString", "", "m", "(Ljava/lang/String;)V", "LHm/f$a;", "listener", "k", "(LHm/f$a;)V", "timerInSeconds", "l", "(J)V", "", "j", "()Z", "g", "Landroid/os/CountDownTimer;", "a", "Landroid/os/CountDownTimer;", "i", "()Landroid/os/CountDownTimer;", "setTimer", "(Landroid/os/CountDownTimer;)V", "timer", "b", "LHm/f$a;", "c", "Ljava/lang/String;", "timeData", "d", "Z", "timerRunningStatus", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private CountDownTimer timer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private a listener;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String timeData = "";

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean timerRunningStatus;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"LHm/f$a;", "", "", "Q", "()V", "", "timerString", "D0", "(Ljava/lang/String;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        void D0(String timerString);

        void Q();
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Hm/f$b", "Landroid/os/CountDownTimer;", "", "millisUntilFinished", "", "onTick", "(J)V", "onFinish", "()V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f13732a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, f fVar) {
            super(j10, 1000L);
            this.f13732a = fVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.f13732a.timerRunningStatus = false;
            this.f13732a.timeData = "00:00";
            CountDownTimer timer = this.f13732a.getTimer();
            if (timer != null) {
                timer.cancel();
            }
            a aVar = this.f13732a.listener;
            if (aVar != null) {
                aVar.Q();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            if (millisUntilFinished > 1000) {
                f fVar = this.f13732a;
                fVar.timeData = fVar.h(millisUntilFinished);
                f fVar2 = this.f13732a;
                fVar2.m(String.valueOf(fVar2.timeData));
            }
        }
    }

    public final void l(long timerInSeconds) {
        this.timerRunningStatus = true;
        this.timer = new b(timerInSeconds * 1000, this).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(String timerString) {
        a aVar = this.listener;
        if (aVar != null) {
            aVar.D0(timerString);
        }
    }

    public final void g() {
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timerRunningStatus = false;
    }

    /* renamed from: i, reason: from getter */
    public final CountDownTimer getTimer() {
        return this.timer;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getTimerRunningStatus() {
        return this.timerRunningStatus;
    }

    public final void k(a listener) {
        this.listener = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String h(long millisUntilFinished) {
        long j10 = 60;
        long j11 = (millisUntilFinished / 60000) % j10;
        long j12 = (millisUntilFinished / 1000) % j10;
        DecimalFormat decimalFormat = new DecimalFormat("00");
        return decimalFormat.format(j11) + ':' + decimalFormat.format(j12);
    }
}
