package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* loaded from: classes14.dex */
public interface TypeAttributeTranslator {

    public static final class DefaultImpls {
        public static /* synthetic */ TypeAttributes a(TypeAttributeTranslator typeAttributeTranslator, Annotations annotations, TypeConstructor typeConstructor, DeclarationDescriptor declarationDescriptor, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAttributes");
            }
            if ((i10 & 2) != 0) {
                typeConstructor = null;
            }
            if ((i10 & 4) != 0) {
                declarationDescriptor = null;
            }
            return typeAttributeTranslator.a(annotations, typeConstructor, declarationDescriptor);
        }
    }

    TypeAttributes a(Annotations annotations, TypeConstructor typeConstructor, DeclarationDescriptor declarationDescriptor);
}
