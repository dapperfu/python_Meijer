package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class JvmBuiltIns extends KotlinBuiltIns {

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f143521k = {Reflection.j(new PropertyReference1Impl(JvmBuiltIns.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0))};

    /* renamed from: h, reason: collision with root package name */
    private final Kind f143522h;

    /* renamed from: i, reason: collision with root package name */
    private Function0<Settings> f143523i;

    /* renamed from: j, reason: collision with root package name */
    private final NotNullLazyValue f143524j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Kind {

        /* renamed from: a, reason: collision with root package name */
        public static final Kind f143525a = new Kind("FROM_DEPENDENCIES", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final Kind f143526b = new Kind("FROM_CLASS_LOADER", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final Kind f143527c = new Kind("FALLBACK", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ Kind[] f143528d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f143529e;

        private static final /* synthetic */ Kind[] a() {
            return new Kind[]{f143525a, f143526b, f143527c};
        }

        static {
            Kind[] kindArrA = a();
            f143528d = kindArrA;
            f143529e = EnumEntriesKt.a(kindArrA);
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) f143528d.clone();
        }

        private Kind(String str, int i10) {
        }
    }

    public static final class Settings {

        /* renamed from: a, reason: collision with root package name */
        private final ModuleDescriptor f143530a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f143531b;

        public Settings(ModuleDescriptor ownerModuleDescriptor, boolean z10) {
            Intrinsics.j(ownerModuleDescriptor, "ownerModuleDescriptor");
            this.f143530a = ownerModuleDescriptor;
            this.f143531b = z10;
        }

        public final ModuleDescriptor a() {
            return this.f143530a;
        }

        public final boolean b() {
            return this.f143531b;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Kind.values().length];
            try {
                iArr[Kind.f143525a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Kind.f143526b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Kind.f143527c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns(StorageManager storageManager, Kind kind) {
        super(storageManager);
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(kind, "kind");
        this.f143522h = kind;
        this.f143524j = storageManager.c(new c(this, storageManager));
        int i10 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                f(false);
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JvmBuiltInsCustomizer J0(JvmBuiltIns jvmBuiltIns, StorageManager storageManager) {
        ModuleDescriptorImpl moduleDescriptorImplS = jvmBuiltIns.s();
        Intrinsics.i(moduleDescriptorImplS, "getBuiltInsModule(...)");
        return new JvmBuiltInsCustomizer(moduleDescriptorImplS, storageManager, new e(jvmBuiltIns));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Settings K0(JvmBuiltIns jvmBuiltIns) {
        Function0<Settings> function0 = jvmBuiltIns.f143523i;
        if (function0 == null) {
            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
        }
        Settings settingsInvoke = function0.invoke();
        jvmBuiltIns.f143523i = null;
        return settingsInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Settings O0(ModuleDescriptor moduleDescriptor, boolean z10) {
        return new Settings(moduleDescriptor, z10);
    }

    public final JvmBuiltInsCustomizer M0() {
        return (JvmBuiltInsCustomizer) StorageKt.a(this.f143524j, this, f143521k[0]);
    }

    public final void N0(ModuleDescriptor moduleDescriptor, boolean z10) {
        Intrinsics.j(moduleDescriptor, "moduleDescriptor");
        P0(new d(moduleDescriptor, z10));
    }

    public final void P0(Function0<Settings> computation) {
        Intrinsics.j(computation, "computation");
        this.f143523i = computation;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public List<ClassDescriptorFactory> w() {
        Iterable<ClassDescriptorFactory> iterableW = super.w();
        Intrinsics.i(iterableW, "getClassDescriptorFactories(...)");
        StorageManager storageManagerV = V();
        Intrinsics.i(storageManagerV, "getStorageManager(...)");
        ModuleDescriptorImpl moduleDescriptorImplS = s();
        Intrinsics.i(moduleDescriptorImplS, "getBuiltInsModule(...)");
        return CollectionsKt.O0(iterableW, new JvmBuiltInClassDescriptorFactory(storageManagerV, moduleDescriptorImplS, null, 4, null));
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    protected PlatformDependentDeclarationFilter N() {
        return M0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    protected AdditionalClassPartsProvider g() {
        return M0();
    }
}
