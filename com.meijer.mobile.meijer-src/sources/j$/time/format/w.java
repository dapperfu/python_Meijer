package j$.time.format;

import j$.time.DateTimeException;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final TemporalAccessor f139482a;

    /* renamed from: b, reason: collision with root package name */
    public final DateTimeFormatter f139483b;

    /* renamed from: c, reason: collision with root package name */
    public int f139484c;

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(j$.time.temporal.TemporalAccessor r10, j$.time.format.DateTimeFormatter r11) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.w.<init>(j$.time.temporal.TemporalAccessor, j$.time.format.DateTimeFormatter):void");
    }

    public final Object b(TemporalQuery temporalQuery) {
        TemporalAccessor temporalAccessor = this.f139482a;
        Object objD = temporalAccessor.d(temporalQuery);
        if (objD != null || this.f139484c != 0) {
            return objD;
        }
        throw new DateTimeException("Unable to extract " + temporalQuery + " from temporal " + temporalAccessor);
    }

    public final Long a(TemporalField temporalField) {
        int i10 = this.f139484c;
        TemporalAccessor temporalAccessor = this.f139482a;
        if (i10 <= 0 || temporalAccessor.h(temporalField)) {
            return Long.valueOf(temporalAccessor.j(temporalField));
        }
        return null;
    }

    public final String toString() {
        return this.f139482a.toString();
    }
}
