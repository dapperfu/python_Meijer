package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public abstract class DelegatedDescriptorVisibility extends DescriptorVisibility {

    /* renamed from: a, reason: collision with root package name */
    private final Visibility f144502a;

    public DelegatedDescriptorVisibility(Visibility delegate) {
        Intrinsics.j(delegate, "delegate");
        this.f144502a = delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    public Visibility b() {
        return this.f144502a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    public String c() {
        return b().b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    public DescriptorVisibility f() {
        DescriptorVisibility descriptorVisibilityJ = DescriptorVisibilities.j(b().d());
        Intrinsics.i(descriptorVisibilityJ, "toDescriptorVisibility(...)");
        return descriptorVisibilityJ;
    }
}
