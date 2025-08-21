package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* loaded from: classes14.dex */
public final class FieldDescriptorImpl extends AnnotatedImpl implements FieldDescriptor {

    /* renamed from: b, reason: collision with root package name */
    private final PropertyDescriptor f144755b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldDescriptorImpl(Annotations annotations, PropertyDescriptor correspondingProperty) {
        super(annotations);
        Intrinsics.j(annotations, "annotations");
        Intrinsics.j(correspondingProperty, "correspondingProperty");
        this.f144755b = correspondingProperty;
    }
}
