package hi;

import hi.AbstractC14481h;
import hi.AbstractC14482i;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00172\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lhi/c;", "", "<init>", "()V", "", "value", "Lhi/h$a;", "a", "(Ljava/lang/String;)Lhi/h$a;", "Lhi/h$b;", "h", "(Ljava/lang/String;)Lhi/h$b;", "name", "Lhi/i$e;", "g", "(Ljava/lang/String;)Lhi/i$e;", "Lhi/i$d;", "d", "(Ljava/lang/String;)Lhi/i$d;", "Lhi/i$c;", "c", "(Ljava/lang/String;)Lhi/i$c;", "key", "Lhi/i$b;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lhi/i$b;", "e", "(Ljava/lang/String;)Lhi/i$b;", "f", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: hi.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C14476c {

    /* renamed from: a, reason: collision with root package name */
    public static final C14476c f135058a = new C14476c();

    @JvmStatic
    public static final AbstractC14482i.Extra e(String value) {
        if (value == null || StringsKt.r0(value)) {
            value = null;
        }
        if (value != null) {
            return b("previousTrackAction", value);
        }
        return null;
    }

    @JvmStatic
    public static final AbstractC14482i.Extra f(String value) {
        if (value == null || StringsKt.r0(value)) {
            value = null;
        }
        if (value != null) {
            return b("previousTrackState", value);
        }
        return null;
    }

    @JvmStatic
    public static final AbstractC14481h.Action a(String value) {
        Intrinsics.j(value, "value");
        return new AbstractC14481h.Action(value);
    }

    @JvmStatic
    public static final AbstractC14482i.Extra b(String key, String value) {
        Intrinsics.j(key, "key");
        return new AbstractC14482i.Extra(key, value);
    }

    @JvmStatic
    public static final AbstractC14482i.Page c(String name) {
        return new AbstractC14482i.Page(name);
    }

    @JvmStatic
    public static final AbstractC14482i.PageType d(String name) {
        return new AbstractC14482i.PageType(name);
    }

    @JvmStatic
    public static final AbstractC14482i.Section g(String name) {
        return new AbstractC14482i.Section(name);
    }

    @JvmStatic
    public static final AbstractC14481h.State h(String value) {
        Intrinsics.j(value, "value");
        return new AbstractC14481h.State(value);
    }

    private C14476c() {
    }
}
