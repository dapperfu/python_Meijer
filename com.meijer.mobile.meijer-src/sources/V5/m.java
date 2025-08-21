package V5;

import V5.n;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003:\u0001\u0005J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LV5/m;", "LV5/n;", "T", "", "", "a", "()V", "b", "dismiss", "LV5/m$a;", "getState", "()LV5/m$a;", "c", "()LV5/n;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public interface m<T extends n<?>> {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LV5/m$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum a {
        VISIBLE,
        HIDDEN,
        DETACHED
    }

    void a();

    void b();

    T c();

    void dismiss();

    a getState();
}
