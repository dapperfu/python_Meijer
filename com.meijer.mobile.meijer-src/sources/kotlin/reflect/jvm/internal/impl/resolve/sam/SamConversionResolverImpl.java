package kotlin.reflect.jvm.internal.impl.resolve.sam;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNullableValues;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class SamConversionResolverImpl implements SamConversionResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Iterable<Object> f147154a;

    /* renamed from: b, reason: collision with root package name */
    private final CacheWithNullableValues<ClassDescriptor, SimpleType> f147155b;

    public SamConversionResolverImpl(StorageManager storageManager, Iterable<? extends Object> samWithReceiverResolvers) {
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(samWithReceiverResolvers, "samWithReceiverResolvers");
        this.f147154a = samWithReceiverResolvers;
        this.f147155b = storageManager.h();
    }
}
