package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* loaded from: classes14.dex */
class Y implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Y f145599a = new Y();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return SignatureEnhancement.n((CallableMemberDescriptor) obj);
    }
}
