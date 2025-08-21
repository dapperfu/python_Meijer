package V5;

import V5.n;
import io.constructor.data.local.PreferencesHelper;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0007\u0010\r\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LV5/n;", "T", "", "LV5/q;", "listener", "<init>", "(LV5/q;)V", "a", "LV5/q;", "b", "()LV5/q;", "", "Ljava/lang/String;", "()Ljava/lang/String;", PreferencesHelper.PREF_ID, "LV5/b;", "LV5/h;", "LV5/j;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public abstract class n<T extends n<T>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q<T> listener;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String id;

    public /* synthetic */ n(q qVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(qVar);
    }

    private n(q<T> qVar) {
        this.listener = qVar;
        String string = UUID.randomUUID().toString();
        Intrinsics.i(string, "randomUUID().toString()");
        this.id = string;
    }

    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final q<T> b() {
        return this.listener;
    }
}
