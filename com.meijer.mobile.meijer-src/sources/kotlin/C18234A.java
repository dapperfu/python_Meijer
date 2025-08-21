package kotlin;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ly1/A;", "", "", "Ly1/z;", "settings", "<init>", "([Ly1/z;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Z", "getNeedsDensity$ui_text_release", "()Z", "needsDensity", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: y1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18234A {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<InterfaceC18283z> settings;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean needsDensity;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C18234A) && Intrinsics.e(this.settings, ((C18234A) other).settings);
    }

    public final List<InterfaceC18283z> a() {
        return this.settings;
    }

    public int hashCode() {
        return this.settings.hashCode();
    }

    public C18234A(InterfaceC18283z... interfaceC18283zArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z10 = false;
        for (InterfaceC18283z interfaceC18283z : interfaceC18283zArr) {
            String strC = interfaceC18283z.c();
            Object arrayList = linkedHashMap.get(strC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strC, arrayList);
            }
            ((List) arrayList).add(interfaceC18283z);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                CollectionsKt.C(arrayList2, list);
            } else {
                throw new IllegalArgumentException(('\'' + str + "' must be unique. Actual [ [" + CollectionsKt.B0(list, null, null, null, 0, null, null, 63, null) + ']').toString());
            }
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        this.settings = arrayList3;
        int size = arrayList3.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (((InterfaceC18283z) arrayList3.get(i10)).a()) {
                z10 = true;
                break;
            }
            i10++;
        }
        this.needsDensity = z10;
    }
}
