package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class PackagePartScopeCache {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedDescriptorResolver f144035a;

    /* renamed from: b, reason: collision with root package name */
    private final ReflectKotlinClassFinder f144036b;

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap<ClassId, MemberScope> f144037c;

    public PackagePartScopeCache(DeserializedDescriptorResolver resolver, ReflectKotlinClassFinder kotlinClassFinder) {
        Intrinsics.j(resolver, "resolver");
        Intrinsics.j(kotlinClassFinder, "kotlinClassFinder");
        this.f144035a = resolver;
        this.f144036b = kotlinClassFinder;
        this.f144037c = new ConcurrentHashMap<>();
    }

    public final MemberScope a(ReflectKotlinClass fileClass) {
        Collection collectionE;
        Intrinsics.j(fileClass, "fileClass");
        ConcurrentHashMap<ClassId, MemberScope> concurrentHashMap = this.f144037c;
        ClassId classIdF = fileClass.f();
        MemberScope memberScope = concurrentHashMap.get(classIdF);
        if (memberScope == null) {
            FqName fqNameF = fileClass.f().f();
            if (fileClass.b().c() == KotlinClassHeader.Kind.f144871h) {
                List<String> listF = fileClass.b().f();
                collectionE = new ArrayList();
                for (String str : listF) {
                    ClassId.Companion companion = ClassId.f145674d;
                    FqName fqNameE = JvmClassName.d(str).e();
                    Intrinsics.i(fqNameE, "getFqNameForTopLevelClassMaybeWithDollars(...)");
                    KotlinJvmBinaryClass kotlinJvmBinaryClassB = KotlinClassFinderKt.b(this.f144036b, companion.c(fqNameE), this.f144035a.f().g().d());
                    if (kotlinJvmBinaryClassB != null) {
                        collectionE.add(kotlinJvmBinaryClassB);
                    }
                }
            } else {
                collectionE = CollectionsKt.e(fileClass);
            }
            EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor = new EmptyPackageFragmentDescriptor(this.f144035a.f().q(), fqNameF);
            ArrayList arrayList = new ArrayList();
            Iterator it = collectionE.iterator();
            while (it.hasNext()) {
                MemberScope memberScopeC = this.f144035a.c(emptyPackageFragmentDescriptor, (KotlinJvmBinaryClass) it.next());
                if (memberScopeC != null) {
                    arrayList.add(memberScopeC);
                }
            }
            List listJ1 = CollectionsKt.j1(arrayList);
            MemberScope memberScopeA = ChainedMemberScope.f146249d.a("package " + fqNameF + " (" + fileClass + ')', listJ1);
            MemberScope memberScopePutIfAbsent = concurrentHashMap.putIfAbsent(classIdF, memberScopeA);
            memberScope = memberScopePutIfAbsent == null ? memberScopeA : memberScopePutIfAbsent;
        }
        Intrinsics.i(memberScope, "getOrPut(...)");
        return memberScope;
    }
}
