package ii;

import ii.AbstractC14761h;
import ii.AbstractC14762i;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00172\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lii/c;", "", "<init>", "()V", "", "value", "Lii/h$a;", "a", "(Ljava/lang/String;)Lii/h$a;", "Lii/h$b;", "h", "(Ljava/lang/String;)Lii/h$b;", "name", "Lii/i$e;", "g", "(Ljava/lang/String;)Lii/i$e;", "Lii/i$d;", "d", "(Ljava/lang/String;)Lii/i$d;", "Lii/i$c;", "c", "(Ljava/lang/String;)Lii/i$c;", "key", "Lii/i$b;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lii/i$b;", "e", "(Ljava/lang/String;)Lii/i$b;", "f", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ii.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C14756c {

    /* renamed from: a, reason: collision with root package name */
    public static final C14756c f137698a = new C14756c();

    @JvmStatic
    public static final AbstractC14762i.Extra e(String value) {
        if (value == null || StringsKt.s0(value)) {
            value = null;
        }
        if (value != null) {
            return b("previousTrackAction", value);
        }
        return null;
    }

    @JvmStatic
    public static final AbstractC14762i.Extra f(String value) {
        if (value == null || StringsKt.s0(value)) {
            value = null;
        }
        if (value != null) {
            return b("previousTrackState", value);
        }
        return null;
    }

    @JvmStatic
    public static final AbstractC14761h.Action a(String value) {
        Intrinsics.j(value, "value");
        return new AbstractC14761h.Action(value);
    }

    @JvmStatic
    public static final AbstractC14762i.Extra b(String key, String value) {
        Intrinsics.j(key, "key");
        return new AbstractC14762i.Extra(key, value);
    }

    @JvmStatic
    public static final AbstractC14762i.Page c(String name) {
        return new AbstractC14762i.Page(name);
    }

    @JvmStatic
    public static final AbstractC14762i.PageType d(String name) {
        return new AbstractC14762i.PageType(name);
    }

    @JvmStatic
    public static final AbstractC14762i.Section g(String name) {
        return new AbstractC14762i.Section(name);
    }

    @JvmStatic
    public static final AbstractC14761h.State h(String value) {
        Intrinsics.j(value, "value");
        return new AbstractC14761h.State(value);
    }

    private C14756c() {
    }
}
