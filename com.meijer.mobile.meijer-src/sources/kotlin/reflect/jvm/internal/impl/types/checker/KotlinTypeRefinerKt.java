package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class KotlinTypeRefinerKt {

    /* renamed from: a, reason: collision with root package name */
    private static final ModuleCapability<Ref<TypeRefinementSupport>> f147726a = new ModuleCapability<>("KotlinTypeRefiner");

    public static final ModuleCapability<Ref<TypeRefinementSupport>> a() {
        return f147726a;
    }

    public static final List<KotlinType> b(KotlinTypeRefiner kotlinTypeRefiner, Iterable<? extends KotlinType> types) {
        Intrinsics.j(kotlinTypeRefiner, "<this>");
        Intrinsics.j(types, "types");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(types, 10));
        Iterator<? extends KotlinType> it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlinTypeRefiner.a(it.next()));
        }
        return arrayList;
    }
}
