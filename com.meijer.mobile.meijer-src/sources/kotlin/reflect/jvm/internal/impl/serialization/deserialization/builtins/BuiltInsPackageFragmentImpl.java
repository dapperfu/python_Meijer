package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.ReadPackageFragmentKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes14.dex */
public final class BuiltInsPackageFragmentImpl extends DeserializedPackageFragmentImpl implements BuiltInsPackageFragment {

    /* renamed from: o, reason: collision with root package name */
    public static final Companion f147360o = new Companion(null);

    /* renamed from: n, reason: collision with root package name */
    private final boolean f147361n;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BuiltInsPackageFragmentImpl a(FqName fqName, StorageManager storageManager, ModuleDescriptor module, InputStream inputStream, boolean z10) {
            Intrinsics.j(fqName, "fqName");
            Intrinsics.j(storageManager, "storageManager");
            Intrinsics.j(module, "module");
            Intrinsics.j(inputStream, "inputStream");
            Pair<ProtoBuf.PackageFragment, BuiltInsBinaryVersion> pairA = ReadPackageFragmentKt.a(inputStream);
            ProtoBuf.PackageFragment packageFragmentA = pairA.a();
            BuiltInsBinaryVersion builtInsBinaryVersionB = pairA.b();
            if (packageFragmentA != null) {
                return new BuiltInsPackageFragmentImpl(fqName, storageManager, module, packageFragmentA, builtInsBinaryVersionB, z10, null);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + BuiltInsBinaryVersion.f146384h + ", actual " + builtInsBinaryVersionB + ". Please update Kotlin");
        }
    }

    public /* synthetic */ BuiltInsPackageFragmentImpl(FqName fqName, StorageManager storageManager, ModuleDescriptor moduleDescriptor, ProtoBuf.PackageFragment packageFragment, BuiltInsBinaryVersion builtInsBinaryVersion, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fqName, storageManager, moduleDescriptor, packageFragment, builtInsBinaryVersion, z10);
    }

    private BuiltInsPackageFragmentImpl(FqName fqName, StorageManager storageManager, ModuleDescriptor moduleDescriptor, ProtoBuf.PackageFragment packageFragment, BuiltInsBinaryVersion builtInsBinaryVersion, boolean z10) {
        super(fqName, storageManager, moduleDescriptor, packageFragment, builtInsBinaryVersion, null);
        this.f147361n = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public String toString() {
        return "builtins package fragment for " + e() + " from " + DescriptorUtilsKt.s(this);
    }
}
