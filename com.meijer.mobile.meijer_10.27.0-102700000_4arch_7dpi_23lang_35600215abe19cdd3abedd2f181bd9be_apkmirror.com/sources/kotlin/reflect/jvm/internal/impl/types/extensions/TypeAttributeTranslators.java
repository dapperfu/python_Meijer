package kotlin.reflect.jvm.internal.impl.types.extensions;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class TypeAttributeTranslators {

    /* renamed from: a, reason: collision with root package name */
    private final List<TypeAttributeTranslator> f146998a;

    /* JADX WARN: Multi-variable type inference failed */
    public TypeAttributeTranslators(List<? extends TypeAttributeTranslator> translators) {
        Intrinsics.j(translators, "translators");
        this.f146998a = translators;
    }

    public final List<TypeAttributeTranslator> a() {
        return this.f146998a;
    }
}
