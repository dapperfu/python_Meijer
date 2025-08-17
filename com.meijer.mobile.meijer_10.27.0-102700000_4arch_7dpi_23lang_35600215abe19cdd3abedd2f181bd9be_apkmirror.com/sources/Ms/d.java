package Ms;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/weeklyad/services/api/models/FlippWeeklyAdPublicationJson;", "LJs/e;", "a", "(Lcom/meijer/mobile/weeklyad/services/api/models/FlippWeeklyAdPublicationJson;)LJs/e;", "flipp_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class d {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final Js.WeeklyAdPublication a(com.meijer.mobile.weeklyad.services.api.models.FlippWeeklyAdPublicationJson r13) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.j(r13, r0)
            java.lang.String r0 = r13.getFlyerType()
            r1 = 0
            if (r0 == 0) goto L20
            boolean r2 = kotlin.text.StringsKt.r0(r0)
            if (r2 != 0) goto L13
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L20
            java.lang.CharSequence r0 = kotlin.text.StringsKt.y1(r0)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L22
        L20:
            java.lang.String r0 = "UNKNOWN"
        L22:
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r3 = "ROOT"
            kotlin.jvm.internal.Intrinsics.i(r2, r3)
            java.lang.String r4 = r0.toLowerCase(r2)
            java.lang.String r5 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.i(r4, r5)
            r5 = 0
            r6 = 2
            java.lang.String r7 = "pullout"
            boolean r4 = kotlin.text.StringsKt.c0(r4, r7, r5, r6, r1)
            if (r4 == 0) goto L40
            Js.a r0 = Js.a.f16070c
        L3e:
            r3 = r0
            goto L54
        L40:
            kotlin.jvm.internal.Intrinsics.i(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L51
            java.lang.String r0 = r0.toUpperCase(r2)     // Catch: java.lang.IllegalArgumentException -> L51
            java.lang.String r2 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.i(r0, r2)     // Catch: java.lang.IllegalArgumentException -> L51
            Js.a r0 = Js.a.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> L51
            goto L3e
        L51:
            Js.a r0 = Js.a.f16072e
            goto L3e
        L54:
            java.lang.String r4 = r13.getFirstPageThumbnailUrlMedium()
            int r5 = r13.getTotalPages()
            int r6 = r13.getFlyerID()
            int r7 = r13.getFlyerRunId()
            java.lang.String r8 = r13.getSfmlUrl()
            java.lang.String r9 = r13.getPostalCode()
            java.lang.String r0 = r13.getValidFrom()
            if (r0 == 0) goto L85
            vk.a r2 = vk.C17590a.f164803a
            j$.time.format.DateTimeFormatter r2 = r2.s()
            jj.r r10 = new jj.r
            r10.<init>()
            java.lang.Object r0 = vk.d.b(r0, r2, r10)
            j$.time.OffsetDateTime r0 = (j$.time.OffsetDateTime) r0
            r10 = r0
            goto L86
        L85:
            r10 = r1
        L86:
            java.lang.String r0 = r13.getValidTo()
            if (r0 == 0) goto L9f
            vk.a r2 = vk.C17590a.f164803a
            j$.time.format.DateTimeFormatter r2 = r2.s()
            jj.r r11 = new jj.r
            r11.<init>()
            java.lang.Object r0 = vk.d.b(r0, r2, r11)
            j$.time.OffsetDateTime r0 = (j$.time.OffsetDateTime) r0
            r11 = r0
            goto La0
        L9f:
            r11 = r1
        La0:
            java.lang.String r0 = r13.getExternalDisplayName()
            if (r0 == 0) goto Lae
            int r2 = r0.length()
            if (r2 != 0) goto Lad
            goto Lae
        Lad:
            r1 = r0
        Lae:
            if (r1 != 0) goto Lb4
            java.lang.String r1 = r13.getName()
        Lb4:
            r12 = r1
            Js.e r2 = new Js.e
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Ms.d.a(com.meijer.mobile.weeklyad.services.api.models.FlippWeeklyAdPublicationJson):Js.e");
    }
}
