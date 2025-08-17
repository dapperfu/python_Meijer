package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public abstract class DelegatedDescriptorVisibility extends DescriptorVisibility {

    /* renamed from: a, reason: collision with root package name */
    private final Visibility f143595a;

    public DelegatedDescriptorVisibility(Visibility delegate) {
        Intrinsics.j(delegate, "delegate");
        this.f143595a = delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    public Visibility b() {
        return this.f143595a;
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
