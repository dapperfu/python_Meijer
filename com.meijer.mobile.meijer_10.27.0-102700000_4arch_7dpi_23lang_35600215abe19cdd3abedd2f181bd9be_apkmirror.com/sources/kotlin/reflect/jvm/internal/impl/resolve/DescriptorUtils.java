package kotlin.reflect.jvm.internal.impl.resolve;

import com.medallia.digital.mobilesdk.l3;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: classes13.dex */
public class DescriptorUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final FqName f146117a = new FqName("kotlin.jvm.JvmName");

    public static boolean E(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(1);
        }
        while (declarationDescriptor != null) {
            if (u(declarationDescriptor) || y(declarationDescriptor)) {
                return true;
            }
            declarationDescriptor = declarationDescriptor.b();
        }
        return false;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 60:
            case 63:
            case 81:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case l3.f92486e /* 32 */:
            case 45:
            case 66:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = "result";
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case BinsView.LABEL_WIDTH_DP /* 80 */:
                objArr[0] = "annotated";
                break;
            case 84:
            case 86:
            case 89:
            case 91:
                objArr[0] = "scope";
                break;
            case 87:
            case 90:
            case 92:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 59:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 75:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case l3.f92486e /* 32 */:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case BinsView.LABEL_WIDTH_DP /* 80 */:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case 86:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean A(DeclarationDescriptor declarationDescriptor) {
        return D(declarationDescriptor, ClassKind.f143587d);
    }

    public static boolean B(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(36);
        }
        return D(declarationDescriptor, ClassKind.f143588e);
    }

    public static boolean C(DeclarationDescriptor declarationDescriptor) {
        return D(declarationDescriptor, ClassKind.f143586c);
    }

    private static boolean D(DeclarationDescriptor declarationDescriptor, ClassKind classKind) {
        if (classKind == null) {
            a(37);
        }
        return (declarationDescriptor instanceof ClassDescriptor) && ((ClassDescriptor) declarationDescriptor).f() == classKind;
    }

    private static boolean F(KotlinType kotlinType, DeclarationDescriptor declarationDescriptor) {
        if (kotlinType == null) {
            a(30);
        }
        if (declarationDescriptor == null) {
            a(31);
        }
        ClassifierDescriptor classifierDescriptorD = kotlinType.K0().d();
        if (classifierDescriptorD == null) {
            return false;
        }
        DeclarationDescriptor declarationDescriptorA = classifierDescriptorD.H0();
        return (declarationDescriptorA instanceof ClassifierDescriptor) && (declarationDescriptor instanceof ClassifierDescriptor) && ((ClassifierDescriptor) declarationDescriptor).i().equals(((ClassifierDescriptor) declarationDescriptorA).i());
    }

    public static boolean G(DeclarationDescriptor declarationDescriptor) {
        return (D(declarationDescriptor, ClassKind.f143585b) || D(declarationDescriptor, ClassKind.f143586c)) && ((ClassDescriptor) declarationDescriptor).q() == Modality.f143620c;
    }

    public static boolean H(ClassDescriptor classDescriptor, ClassDescriptor classDescriptor2) {
        if (classDescriptor == null) {
            a(28);
        }
        if (classDescriptor2 == null) {
            a(29);
        }
        return I(classDescriptor.o(), classDescriptor2.H0());
    }

    public static boolean I(KotlinType kotlinType, DeclarationDescriptor declarationDescriptor) {
        if (kotlinType == null) {
            a(32);
        }
        if (declarationDescriptor == null) {
            a(33);
        }
        if (F(kotlinType, declarationDescriptor)) {
            return true;
        }
        Iterator<KotlinType> it = kotlinType.K0().a().iterator();
        while (it.hasNext()) {
            if (I(it.next(), declarationDescriptor)) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(DeclarationDescriptor declarationDescriptor) {
        return declarationDescriptor != null && (declarationDescriptor.b() instanceof PackageFragmentDescriptor);
    }

    public static boolean K(VariableDescriptor variableDescriptor, KotlinType kotlinType) {
        if (variableDescriptor == null) {
            a(65);
        }
        if (kotlinType == null) {
            a(66);
        }
        if (variableDescriptor.L() || KotlinTypeKt.a(kotlinType)) {
            return false;
        }
        if (TypeUtils.b(kotlinType)) {
            return true;
        }
        KotlinBuiltIns kotlinBuiltInsM = DescriptorUtilsKt.m(variableDescriptor);
        if (!KotlinBuiltIns.t0(kotlinType)) {
            KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.f146816a;
            if (!kotlinTypeChecker.b(kotlinBuiltInsM.X(), kotlinType) && !kotlinTypeChecker.b(kotlinBuiltInsM.L().o(), kotlinType) && !kotlinTypeChecker.b(kotlinBuiltInsM.i(), kotlinType) && !UnsignedTypes.d(kotlinType)) {
                return false;
            }
        }
        return true;
    }

    public static <D extends CallableMemberDescriptor> D L(D d10) {
        if (d10 == null) {
            a(58);
        }
        while (d10.f() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            Collection<? extends CallableMemberDescriptor> collectionD = d10.d();
            if (collectionD.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d10);
            }
            d10 = (D) collectionD.iterator().next();
        }
        return d10;
    }

    public static <D extends DeclarationDescriptorWithVisibility> D M(D d10) {
        if (d10 == null) {
            a(63);
        }
        if (d10 instanceof CallableMemberDescriptor) {
            return L((CallableMemberDescriptor) d10);
        }
        if (d10 == null) {
            a(64);
        }
        return d10;
    }

    public static boolean b(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            a(16);
        }
        if (declarationDescriptor2 == null) {
            a(17);
        }
        return g(declarationDescriptor).equals(g(declarationDescriptor2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <D extends CallableDescriptor> void c(D d10, Set<D> set) {
        if (d10 == null) {
            a(72);
        }
        if (set == 0) {
            a(73);
        }
        if (set.contains(d10)) {
            return;
        }
        Iterator<? extends CallableDescriptor> it = d10.H0().d().iterator();
        while (it.hasNext()) {
            CallableDescriptor callableDescriptorA = it.next().H0();
            c(callableDescriptorA, set);
            set.add(callableDescriptorA);
        }
    }

    public static <D extends CallableDescriptor> Set<D> d(D d10) {
        if (d10 == null) {
            a(70);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c(d10.H0(), linkedHashSet);
        return linkedHashSet;
    }

    public static ClassDescriptor e(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(45);
        }
        return f(kotlinType.K0());
    }

    public static ClassDescriptor f(TypeConstructor typeConstructor) {
        if (typeConstructor == null) {
            a(46);
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) typeConstructor.d();
        if (classDescriptor == null) {
            a(47);
        }
        return classDescriptor;
    }

    public static ModuleDescriptor g(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(21);
        }
        ModuleDescriptor moduleDescriptorH = h(declarationDescriptor);
        if (moduleDescriptorH == null) {
            a(22);
        }
        return moduleDescriptorH;
    }

    public static ModuleDescriptor h(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(23);
        }
        while (declarationDescriptor != null) {
            if (declarationDescriptor instanceof ModuleDescriptor) {
                return (ModuleDescriptor) declarationDescriptor;
            }
            if (declarationDescriptor instanceof PackageViewDescriptor) {
                return ((PackageViewDescriptor) declarationDescriptor).y0();
            }
            declarationDescriptor = declarationDescriptor.b();
        }
        return null;
    }

    public static ModuleDescriptor i(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(20);
        }
        ClassifierDescriptor classifierDescriptorD = kotlinType.K0().d();
        if (classifierDescriptorD == null) {
            return null;
        }
        return h(classifierDescriptorD);
    }

    public static SourceFile j(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(81);
        }
        if (declarationDescriptor instanceof PropertySetterDescriptor) {
            declarationDescriptor = ((PropertySetterDescriptor) declarationDescriptor).T();
        }
        if (declarationDescriptor instanceof DeclarationDescriptorWithSource) {
            SourceFile sourceFileB = ((DeclarationDescriptorWithSource) declarationDescriptor).g().b();
            if (sourceFileB == null) {
                a(82);
            }
            return sourceFileB;
        }
        SourceFile sourceFile = SourceFile.f143648a;
        if (sourceFile == null) {
            a(83);
        }
        return sourceFile;
    }

    public static DescriptorVisibility k(ClassDescriptor classDescriptor, boolean z10) {
        if (classDescriptor == null) {
            a(48);
        }
        ClassKind classKindF = classDescriptor.f();
        if (classKindF == ClassKind.f143587d || classKindF.b()) {
            DescriptorVisibility descriptorVisibility = DescriptorVisibilities.f143596a;
            if (descriptorVisibility == null) {
                a(49);
            }
            return descriptorVisibility;
        }
        if (G(classDescriptor)) {
            if (z10) {
                DescriptorVisibility descriptorVisibility2 = DescriptorVisibilities.f143598c;
                if (descriptorVisibility2 == null) {
                    a(50);
                }
                return descriptorVisibility2;
            }
            DescriptorVisibility descriptorVisibility3 = DescriptorVisibilities.f143596a;
            if (descriptorVisibility3 == null) {
                a(51);
            }
            return descriptorVisibility3;
        }
        if (u(classDescriptor)) {
            DescriptorVisibility descriptorVisibility4 = DescriptorVisibilities.f143607l;
            if (descriptorVisibility4 == null) {
                a(52);
            }
            return descriptorVisibility4;
        }
        DescriptorVisibility descriptorVisibility5 = DescriptorVisibilities.f143600e;
        if (descriptorVisibility5 == null) {
            a(53);
        }
        return descriptorVisibility5;
    }

    public static ReceiverParameterDescriptor l(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(0);
        }
        if (declarationDescriptor instanceof ClassDescriptor) {
            return ((ClassDescriptor) declarationDescriptor).G0();
        }
        return null;
    }

    public static FqNameUnsafe m(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(2);
        }
        FqName fqNameO = o(declarationDescriptor);
        return fqNameO != null ? fqNameO.i() : p(declarationDescriptor);
    }

    public static FqName n(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(3);
        }
        FqName fqNameO = o(declarationDescriptor);
        if (fqNameO == null) {
            fqNameO = p(declarationDescriptor).m();
        }
        if (fqNameO == null) {
            a(4);
        }
        return fqNameO;
    }

    private static FqName o(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(5);
        }
        if ((declarationDescriptor instanceof ModuleDescriptor) || ErrorUtils.m(declarationDescriptor)) {
            return FqName.f145679d;
        }
        if (declarationDescriptor instanceof PackageViewDescriptor) {
            return ((PackageViewDescriptor) declarationDescriptor).e();
        }
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            return ((PackageFragmentDescriptor) declarationDescriptor).e();
        }
        return null;
    }

    private static FqNameUnsafe p(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(6);
        }
        FqNameUnsafe fqNameUnsafeB = m(declarationDescriptor.b()).b(declarationDescriptor.getName());
        if (fqNameUnsafeB == null) {
            a(7);
        }
        return fqNameUnsafeB;
    }

    public static <D extends DeclarationDescriptor> D q(DeclarationDescriptor declarationDescriptor, Class<D> cls) {
        if (cls == null) {
            a(18);
        }
        return (D) r(declarationDescriptor, cls, true);
    }

    public static <D extends DeclarationDescriptor> D r(DeclarationDescriptor declarationDescriptor, Class<D> cls, boolean z10) {
        if (cls == null) {
            a(19);
        }
        if (declarationDescriptor == null) {
            return null;
        }
        if (z10) {
            declarationDescriptor = (D) declarationDescriptor.b();
        }
        while (declarationDescriptor != null) {
            if (cls.isInstance(declarationDescriptor)) {
                return (D) declarationDescriptor;
            }
            declarationDescriptor = (D) declarationDescriptor.b();
        }
        return null;
    }

    public static ClassDescriptor s(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            a(44);
        }
        Iterator<KotlinType> it = classDescriptor.i().a().iterator();
        while (it.hasNext()) {
            ClassDescriptor classDescriptorE = e(it.next());
            if (classDescriptorE.f() != ClassKind.f143586c) {
                return classDescriptorE;
            }
        }
        return null;
    }

    public static boolean t(DeclarationDescriptor declarationDescriptor) {
        return D(declarationDescriptor, ClassKind.f143589f);
    }

    public static boolean u(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(34);
        }
        return v(declarationDescriptor) && declarationDescriptor.getName().equals(SpecialNames.f145695b);
    }

    public static boolean v(DeclarationDescriptor declarationDescriptor) {
        return D(declarationDescriptor, ClassKind.f143585b);
    }

    public static boolean x(DeclarationDescriptor declarationDescriptor) {
        return D(declarationDescriptor, ClassKind.f143590g) && ((ClassDescriptor) declarationDescriptor).Z();
    }

    public static boolean y(DeclarationDescriptor declarationDescriptor) {
        return (declarationDescriptor instanceof DeclarationDescriptorWithVisibility) && ((DeclarationDescriptorWithVisibility) declarationDescriptor).getVisibility() == DescriptorVisibilities.f143601f;
    }

    public static boolean z(ClassDescriptor classDescriptor, ClassDescriptor classDescriptor2) {
        if (classDescriptor == null) {
            a(26);
        }
        if (classDescriptor2 == null) {
            a(27);
        }
        Iterator<KotlinType> it = classDescriptor.i().a().iterator();
        while (it.hasNext()) {
            if (F(it.next(), classDescriptor2.H0())) {
                return true;
            }
        }
        return false;
    }

    private DescriptorUtils() {
    }

    public static boolean w(DeclarationDescriptor declarationDescriptor) {
        if (!v(declarationDescriptor) && !A(declarationDescriptor)) {
            return false;
        }
        return true;
    }
}
