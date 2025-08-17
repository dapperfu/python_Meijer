package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes13.dex */
public final class ExcludedTypeAnnotations {

    /* renamed from: a, reason: collision with root package name */
    public static final ExcludedTypeAnnotations f146074a = new ExcludedTypeAnnotations();

    /* renamed from: b, reason: collision with root package name */
    private static final Set<FqName> f146075b = SetsKt.i(new FqName("kotlin.internal.NoInfer"), new FqName("kotlin.internal.Exact"));

    public final Set<FqName> a() {
        return f146075b;
    }

    private ExcludedTypeAnnotations() {
    }
}
