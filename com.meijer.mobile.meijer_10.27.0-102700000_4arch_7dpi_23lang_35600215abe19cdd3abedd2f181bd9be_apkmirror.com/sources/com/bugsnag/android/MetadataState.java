package com.bugsnag.android;

import com.bugsnag.android.T0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000e\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0011\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0013\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J)\u0010\u0014\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\fJ\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/bugsnag/android/y0;", "Lcom/bugsnag/android/j;", "", "Lcom/bugsnag/android/x0;", "metadata", "<init>", "(Lcom/bugsnag/android/x0;)V", "", "section", "key", "", "h", "(Ljava/lang/String;Ljava/lang/String;)V", "value", "i", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "", "j", "(Ljava/lang/String;Ljava/util/Map;)V", "b", "a", "c", "(Ljava/lang/String;)V", "d", "f", "()V", "e", "(Lcom/bugsnag/android/x0;)Lcom/bugsnag/android/y0;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/bugsnag/android/x0;", "g", "()Lcom/bugsnag/android/x0;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.bugsnag.android.y0, reason: case insensitive filesystem and from toString */
/* loaded from: classes4.dex */
public final /* data */ class MetadataState extends C6475j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Metadata metadata;

    /* JADX WARN: Multi-variable type inference failed */
    public MetadataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final MetadataState e(Metadata metadata) {
        return new MetadataState(metadata);
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof MetadataState) && Intrinsics.e(this.metadata, ((MetadataState) other).metadata);
        }
        return true;
    }

    public int hashCode() {
        Metadata metadata = this.metadata;
        if (metadata != null) {
            return metadata.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "MetadataState(metadata=" + this.metadata + ")";
    }

    public /* synthetic */ MetadataState(Metadata metadata, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Metadata(null, 1, null) : metadata);
    }

    private final void h(String section, String key) {
        if (key == null) {
            if (getObservers$bugsnag_android_core_release().isEmpty()) {
                return;
            }
            T0.e eVar = new T0.e(section);
            Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
            while (it.hasNext()) {
                ((Q6.l) it.next()).onStateChange(eVar);
            }
            return;
        }
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        T0.f fVar = new T0.f(section, key);
        Iterator<T> it2 = getObservers$bugsnag_android_core_release().iterator();
        while (it2.hasNext()) {
            ((Q6.l) it2.next()).onStateChange(fVar);
        }
    }

    private final void i(String section, String key, Object value) {
        if (value == null) {
            h(section, key);
        } else {
            if (getObservers$bugsnag_android_core_release().isEmpty()) {
                return;
            }
            T0.c cVar = new T0.c(section, key, this.metadata.h(section, key));
            Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
            while (it.hasNext()) {
                ((Q6.l) it.next()).onStateChange(cVar);
            }
        }
    }

    public void a(String section, String key, Object value) {
        this.metadata.a(section, key, value);
        i(section, key, value);
    }

    public void b(String section, Map<String, ? extends Object> value) {
        this.metadata.b(section, value);
        j(section, value);
    }

    public void c(String section) {
        this.metadata.c(section);
        h(section, null);
    }

    public void d(String section, String key) {
        this.metadata.d(section, key);
        h(section, key);
    }

    public final void f() {
        Set<Map.Entry<String, Object>> setEntrySet;
        for (String str : this.metadata.k().keySet()) {
            Map<String, Object> mapI = this.metadata.i(str);
            if (mapI != null && (setEntrySet = mapI.entrySet()) != null) {
                Iterator<T> it = setEntrySet.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    i(str, (String) entry.getKey(), entry.getValue());
                }
            }
        }
    }

    /* renamed from: g, reason: from getter */
    public final Metadata getMetadata() {
        return this.metadata;
    }

    public MetadataState(Metadata metadata) {
        this.metadata = metadata;
    }

    private final void j(String section, Map<String, ? extends Object> value) {
        Iterator<T> it = value.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!getObservers$bugsnag_android_core_release().isEmpty()) {
                T0.c cVar = new T0.c(section, (String) entry.getKey(), this.metadata.h(section, (String) entry.getKey()));
                Iterator<T> it2 = getObservers$bugsnag_android_core_release().iterator();
                while (it2.hasNext()) {
                    ((Q6.l) it2.next()).onStateChange(cVar);
                }
            }
        }
    }
}
