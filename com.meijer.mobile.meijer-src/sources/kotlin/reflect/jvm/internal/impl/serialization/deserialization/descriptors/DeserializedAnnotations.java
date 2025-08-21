package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes14.dex */
public class DeserializedAnnotations implements Annotations {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f147370b = {Reflection.j(new PropertyReference1Impl(DeserializedAnnotations.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};

    /* renamed from: a, reason: collision with root package name */
    private final NotNullLazyValue f147371a;

    public DeserializedAnnotations(StorageManager storageManager, Function0<? extends List<? extends AnnotationDescriptor>> compute) {
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(compute, "compute");
        this.f147371a = storageManager.c(compute);
    }

    private final List<AnnotationDescriptor> a() {
        return (List) StorageKt.a(this.f147371a, this, f147370b[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public AnnotationDescriptor i(FqName fqName) {
        return Annotations.DefaultImpls.a(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        return a().iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean p3(FqName fqName) {
        return Annotations.DefaultImpls.b(this, fqName);
    }
}
