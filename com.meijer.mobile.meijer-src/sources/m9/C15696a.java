package m9;

import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u000bR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0011"}, d2 = {"Lm9/a;", "", "<init>", "()V", "LV8/a;", "feature", "", "c", "(LV8/a;)Z", "", "b", "(LV8/a;)V", "a", "", "", "Ljava/util/Set;", "enabledFeatures", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: m9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15696a {

    /* renamed from: a, reason: collision with root package name */
    public static final C15696a f150917a = new C15696a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static Set<String> enabledFeatures = new HashSet();

    @JvmStatic
    public static final void a(V8.a feature) {
        Intrinsics.j(feature, "feature");
        enabledFeatures.remove(feature.a());
    }

    @JvmStatic
    public static final void b(V8.a feature) {
        Intrinsics.j(feature, "feature");
        enabledFeatures.add(feature.a());
    }

    @JvmStatic
    public static final boolean c(V8.a feature) {
        Intrinsics.j(feature, "feature");
        return enabledFeatures.contains(feature.a());
    }

    private C15696a() {
    }
}
