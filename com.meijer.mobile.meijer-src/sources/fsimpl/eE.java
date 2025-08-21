package fsimpl;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* loaded from: classes15.dex */
class eE implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    final String f133322a;

    /* renamed from: b, reason: collision with root package name */
    final File f133323b;

    /* renamed from: c, reason: collision with root package name */
    final long f133324c;

    /* renamed from: d, reason: collision with root package name */
    final SortedSet f133325d = Collections.synchronizedSortedSet(new TreeSet());

    /* renamed from: e, reason: collision with root package name */
    final Map f133326e = Collections.synchronizedMap(new HashMap());

    eE(File file, long j10) {
        this.f133323b = file;
        this.f133322a = file.getName();
        this.f133324c = j10;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(eE eEVar) {
        if (eEVar != null) {
            return (this.f133324c > eEVar.f133324c ? 1 : (this.f133324c == eEVar.f133324c ? 0 : -1));
        }
        throw new IllegalArgumentException("Null comparable");
    }
}
