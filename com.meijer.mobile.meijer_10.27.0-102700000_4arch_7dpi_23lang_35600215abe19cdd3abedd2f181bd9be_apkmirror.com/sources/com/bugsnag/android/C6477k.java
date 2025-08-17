package com.bugsnag.android;

import Q6.TrimMetrics;
import com.bugsnag.android.C6482m0;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR&\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/bugsnag/android/k;", "Lcom/bugsnag/android/m0$a;", "", "message", "Lcom/bugsnag/android/BreadcrumbType;", "type", "", "", "metadata", "Ljava/util/Date;", "timestamp", "<init>", "(Ljava/lang/String;Lcom/bugsnag/android/BreadcrumbType;Ljava/util/Map;Ljava/util/Date;)V", "(Ljava/lang/String;)V", "", "maxStringLength", "LQ6/p;", "a", "(I)LQ6/p;", "Lcom/bugsnag/android/m0;", "writer", "", "toStream", "(Lcom/bugsnag/android/m0;)V", "Ljava/lang/String;", "b", "Lcom/bugsnag/android/BreadcrumbType;", "c", "Ljava/util/Map;", "d", "Ljava/util/Date;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.bugsnag.android.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6477k implements C6482m0.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public String message;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public BreadcrumbType type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public Map<String, Object> metadata;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final Date timestamp;

    public C6477k(String str, BreadcrumbType breadcrumbType, Map<String, Object> map, Date date) {
        this.message = str;
        this.type = breadcrumbType;
        this.metadata = map;
        this.timestamp = date;
    }

    public C6477k(String str) {
        this(str, BreadcrumbType.MANUAL, new LinkedHashMap(), new Date());
    }

    public final TrimMetrics a(int maxStringLength) {
        Map<String, Object> map = this.metadata;
        return map != null ? Q6.m.f29896a.g(maxStringLength, map) : new TrimMetrics(0, 0);
    }

    @Override // com.bugsnag.android.C6482m0.a
    public void toStream(C6482m0 writer) throws IOException {
        writer.d();
        writer.l("timestamp").e0(this.timestamp);
        writer.l("name").O(this.message);
        writer.l("type").O(this.type.getType());
        writer.l("metaData");
        writer.h0(this.metadata, true);
        writer.i();
    }
}
