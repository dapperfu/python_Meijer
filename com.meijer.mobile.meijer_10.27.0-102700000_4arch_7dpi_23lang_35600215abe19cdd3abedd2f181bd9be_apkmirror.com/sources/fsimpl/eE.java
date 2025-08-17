package fsimpl;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* loaded from: classes14.dex */
class eE implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    final String f132072a;

    /* renamed from: b, reason: collision with root package name */
    final File f132073b;

    /* renamed from: c, reason: collision with root package name */
    final long f132074c;

    /* renamed from: d, reason: collision with root package name */
    final SortedSet f132075d = Collections.synchronizedSortedSet(new TreeSet());

    /* renamed from: e, reason: collision with root package name */
    final Map f132076e = Collections.synchronizedMap(new HashMap());

    eE(File file, long j10) {
        this.f132073b = file;
        this.f132072a = file.getName();
        this.f132074c = j10;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(eE eEVar) {
        if (eEVar != null) {
            return (this.f132074c > eEVar.f132074c ? 1 : (this.f132074c == eEVar.f132074c ? 0 : -1));
        }
        throw new IllegalArgumentException("Null comparable");
    }
}
