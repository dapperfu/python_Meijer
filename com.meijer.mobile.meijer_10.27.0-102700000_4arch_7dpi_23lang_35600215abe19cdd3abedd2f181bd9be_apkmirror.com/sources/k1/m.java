package k1;

import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.t1;
import j1.C14832a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0090\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000e\u001a\u00020\r2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0090\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R/\u0010\u0007\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lk1/m;", "Lk1/g;", "Lk1/c;", "key", "<init>", "(Lk1/c;)V", "T", "value", "", "d", "(Lk1/c;Ljava/lang/Object;)V", "b", "(Lk1/c;)Ljava/lang/Object;", "", "a", "(Lk1/c;)Z", "Lk1/c;", "", "<set-?>", "Landroidx/compose/runtime/l0;", "c", "()Ljava/lang/Object;", "e", "(Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class m extends g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c<?> key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 value;

    public m(c<?> cVar) {
        super(null);
        this.key = cVar;
        this.value = t1.e(null, null, 2, null);
    }

    private final Object c() {
        return this.value.getValue();
    }

    private final void e(Object obj) {
        this.value.setValue(obj);
    }

    @Override // k1.g
    public boolean a(c<?> key) {
        return key == this.key;
    }

    @Override // k1.g
    public <T> T b(c<T> key) {
        if (!(key == this.key)) {
            C14832a.b("Check failed.");
        }
        T t10 = (T) c();
        if (t10 == null) {
            return null;
        }
        return t10;
    }

    public <T> void d(c<T> key, T value) {
        if (!(key == this.key)) {
            C14832a.b("Check failed.");
        }
        e(value);
    }
}
