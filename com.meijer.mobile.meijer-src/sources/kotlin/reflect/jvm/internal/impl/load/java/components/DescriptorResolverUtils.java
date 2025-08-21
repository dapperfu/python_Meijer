package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;

/* loaded from: classes14.dex */
public final class DescriptorResolverUtils {

    static class a extends NonReportingOverrideStrategy {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ErrorReporter f145225a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f145226b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f145227c;

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils$a$a, reason: collision with other inner class name */
        class C2273a implements Function1<CallableMemberDescriptor, Unit> {
            private static /* synthetic */ void a(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
            }

            C2273a() {
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Unit invoke(CallableMemberDescriptor callableMemberDescriptor) {
                if (callableMemberDescriptor == null) {
                    a(0);
                }
                a.this.f145225a.a(callableMemberDescriptor);
                return Unit.f143329a;
            }
        }

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "fromSuper";
            } else if (i10 == 2) {
                objArr[0] = "fromCurrent";
            } else if (i10 == 3) {
                objArr[0] = "member";
            } else if (i10 != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "conflict";
            } else if (i10 == 3 || i10 == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
        public void e(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
            if (callableMemberDescriptor == null) {
                f(1);
            }
            if (callableMemberDescriptor2 == null) {
                f(2);
            }
        }

        a(ErrorReporter errorReporter, Set set, boolean z10) {
            this.f145225a = errorReporter;
            this.f145226b = set;
            this.f145227c = z10;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
        public void a(CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor == null) {
                f(0);
            }
            OverridingUtil.K(callableMemberDescriptor, new C2273a());
            this.f145226b.add(callableMemberDescriptor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
        public void d(CallableMemberDescriptor callableMemberDescriptor, Collection<? extends CallableMemberDescriptor> collection) {
            if (callableMemberDescriptor == null) {
                f(3);
            }
            if (collection == null) {
                f(4);
            }
            if (!this.f145227c || callableMemberDescriptor.f() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                super.d(callableMemberDescriptor, collection);
            }
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str = i10 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 18 ? 3 : 2];
        switch (i10) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static ValueParameterDescriptor b(Name name, ClassDescriptor classDescriptor) {
        if (name == null) {
            a(19);
        }
        if (classDescriptor == null) {
            a(20);
        }
        Collection<ClassConstructorDescriptor> collectionJ = classDescriptor.j();
        if (collectionJ.size() != 1) {
            return null;
        }
        for (ValueParameterDescriptor valueParameterDescriptor : collectionJ.iterator().next().h()) {
            if (valueParameterDescriptor.getName().equals(name)) {
                return valueParameterDescriptor;
            }
        }
        return null;
    }

    private static <D extends CallableMemberDescriptor> Collection<D> c(Name name, Collection<D> collection, Collection<D> collection2, ClassDescriptor classDescriptor, ErrorReporter errorReporter, OverridingUtil overridingUtil, boolean z10) {
        if (name == null) {
            a(12);
        }
        if (collection == null) {
            a(13);
        }
        if (collection2 == null) {
            a(14);
        }
        if (classDescriptor == null) {
            a(15);
        }
        if (errorReporter == null) {
            a(16);
        }
        if (overridingUtil == null) {
            a(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        overridingUtil.v(name, collection, collection2, classDescriptor, new a(errorReporter, linkedHashSet, z10));
        return linkedHashSet;
    }

    public static <D extends CallableMemberDescriptor> Collection<D> d(Name name, Collection<D> collection, Collection<D> collection2, ClassDescriptor classDescriptor, ErrorReporter errorReporter, OverridingUtil overridingUtil) {
        if (name == null) {
            a(0);
        }
        if (collection == null) {
            a(1);
        }
        if (collection2 == null) {
            a(2);
        }
        if (classDescriptor == null) {
            a(3);
        }
        if (errorReporter == null) {
            a(4);
        }
        if (overridingUtil == null) {
            a(5);
        }
        return c(name, collection, collection2, classDescriptor, errorReporter, overridingUtil, false);
    }

    public static <D extends CallableMemberDescriptor> Collection<D> e(Name name, Collection<D> collection, Collection<D> collection2, ClassDescriptor classDescriptor, ErrorReporter errorReporter, OverridingUtil overridingUtil) {
        if (name == null) {
            a(6);
        }
        if (collection == null) {
            a(7);
        }
        if (collection2 == null) {
            a(8);
        }
        if (classDescriptor == null) {
            a(9);
        }
        if (errorReporter == null) {
            a(10);
        }
        if (overridingUtil == null) {
            a(11);
        }
        return c(name, collection, collection2, classDescriptor, errorReporter, overridingUtil, true);
    }
}
