package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlin.Metadata;
import mv.L0;
import nv.C16027d;
import nv.C16029f;
import rv.InterfaceC16981r;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/android/AndroidDispatcherFactory;", "Lrv/r;", "<init>", "()V", "", "allFactories", "Lmv/L0;", "b", "(Ljava/util/List;)Lmv/L0;", "", "a", "()Ljava/lang/String;", "", "c", "()I", "loadPriority", "kotlinx-coroutines-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AndroidDispatcherFactory implements InterfaceC16981r {
    @Override // rv.InterfaceC16981r
    public int c() {
        return 1073741823;
    }

    @Override // rv.InterfaceC16981r
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // rv.InterfaceC16981r
    public L0 b(List<? extends InterfaceC16981r> allFactories) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C16027d(C16029f.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
