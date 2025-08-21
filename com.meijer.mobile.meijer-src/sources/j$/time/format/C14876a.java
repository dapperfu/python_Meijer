package j$.time.format;

import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: j$.time.format.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14876a extends z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f139424d;

    public C14876a(y yVar) {
        this.f139424d = yVar;
    }

    @Override // j$.time.format.z
    public final String b(Chronology chronology, TemporalField temporalField, long j10, TextStyle textStyle, Locale locale) {
        return this.f139424d.a(j10, textStyle);
    }

    @Override // j$.time.format.z
    public final String c(TemporalField temporalField, long j10, TextStyle textStyle, Locale locale) {
        return this.f139424d.a(j10, textStyle);
    }

    @Override // j$.time.format.z
    public final Iterator d(Chronology chronology, TemporalField temporalField, TextStyle textStyle, Locale locale) {
        List list = (List) ((HashMap) this.f139424d.f139486b).get(textStyle);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }

    @Override // j$.time.format.z
    public final Iterator e(TemporalField temporalField, TextStyle textStyle, Locale locale) {
        List list = (List) ((HashMap) this.f139424d.f139486b).get(textStyle);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
