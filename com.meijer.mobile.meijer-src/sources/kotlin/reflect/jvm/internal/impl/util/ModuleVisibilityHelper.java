package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

/* loaded from: classes14.dex */
public interface ModuleVisibilityHelper {
    boolean a(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2);

    public static final class EMPTY implements ModuleVisibilityHelper {

        /* renamed from: a, reason: collision with root package name */
        public static final EMPTY f147978a = new EMPTY();

        @Override // kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper
        public boolean a(DeclarationDescriptor what, DeclarationDescriptor from) {
            Intrinsics.j(what, "what");
            Intrinsics.j(from, "from");
            return true;
        }

        private EMPTY() {
        }
    }
}
