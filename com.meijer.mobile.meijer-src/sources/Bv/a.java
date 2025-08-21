package Bv;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010\u0015\u001a\u0004\b#\u0010\u0017R&\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b \u0010\u0017R \u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010\u0015\u001a\u0004\b&\u0010\u0017¨\u0006("}, d2 = {"LBv/a;", "", "", "serialName", "<init>", "(Ljava/lang/String;)V", "elementName", "LBv/f;", "descriptor", "", "", "annotations", "", "isOptional", "", "a", "(Ljava/lang/String;LBv/f;Ljava/util/List;Z)V", "Ljava/lang/String;", "getSerialName", "()Ljava/lang/String;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "h", "(Ljava/util/List;)V", "getAnnotations$annotations", "()V", "", "f", "elementNames", "", "d", "Ljava/util/Set;", "uniqueNames", "e", "elementDescriptors", "elementAnnotations", "g", "elementOptionality", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String serialName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<? extends Annotation> annotations;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<String> elementNames;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Set<String> uniqueNames;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<f> elementDescriptors;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<List<Annotation>> elementAnnotations;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<Boolean> elementOptionality;

    public a(String serialName) {
        Intrinsics.j(serialName, "serialName");
        this.serialName = serialName;
        this.annotations = CollectionsKt.m();
        this.elementNames = new ArrayList();
        this.uniqueNames = new HashSet();
        this.elementDescriptors = new ArrayList();
        this.elementAnnotations = new ArrayList();
        this.elementOptionality = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(a aVar, String str, f fVar, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = CollectionsKt.m();
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        aVar.a(str, fVar, list, z10);
    }

    public final void a(String elementName, f descriptor, List<? extends Annotation> annotations, boolean isOptional) {
        Intrinsics.j(elementName, "elementName");
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(annotations, "annotations");
        if (this.uniqueNames.add(elementName)) {
            this.elementNames.add(elementName);
            this.elementDescriptors.add(descriptor);
            this.elementAnnotations.add(annotations);
            this.elementOptionality.add(Boolean.valueOf(isOptional));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.serialName).toString());
    }

    public final List<Annotation> c() {
        return this.annotations;
    }

    public final List<List<Annotation>> d() {
        return this.elementAnnotations;
    }

    public final List<f> e() {
        return this.elementDescriptors;
    }

    public final List<String> f() {
        return this.elementNames;
    }

    public final List<Boolean> g() {
        return this.elementOptionality;
    }

    public final void h(List<? extends Annotation> list) {
        Intrinsics.j(list, "<set-?>");
        this.annotations = list;
    }
}
