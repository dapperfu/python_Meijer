package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C10358a3;
import com.google.android.gms.internal.measurement.C10497p7;
import com.google.android.gms.internal.measurement.Q6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11242u extends AbstractC11108b6 {

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f85887f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g, reason: collision with root package name */
    static final String[] f85888g = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f85889h = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f85890i = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f85891j = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f85892k = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f85893l = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f85894m = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: n, reason: collision with root package name */
    private static final String[] f85895n = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: o, reason: collision with root package name */
    private static final String[] f85896o = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* renamed from: p, reason: collision with root package name */
    private static final String[] f85897p = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: d, reason: collision with root package name */
    private final C11235t f85898d;

    /* renamed from: e, reason: collision with root package name */
    private final R5 f85899e;

    final boolean F(String str, long j10) {
        try {
            if (o0("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0L) > 0) {
                return false;
            }
            return o0("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0L) > 0;
        } catch (SQLiteException e10) {
            this.f84868a.a().m().b("Error checking backfill conditions", e10);
            return false;
        }
    }

    public final C11215q J0(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        return K0(j10, str, 1L, false, false, z12, false, z14, z15, z16);
    }

    final /* synthetic */ long Z(String str, String[] strArr, long j10) {
        return o0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", strArr, -1L);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC11108b6
    protected final boolean j() {
        return false;
    }

    final /* synthetic */ R5 k0() {
        return this.f85899e;
    }

    public final long w() {
        return o0("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long y() {
        return o0("select max(timestamp) from raw_events", null, 0L);
    }

    private final void L(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseS0 = s0();
            if (contentValues.getAsString("app_id") == null) {
                this.f84868a.a().o().b("Value of the primary key is not set.", C11218q2.v("app_id"));
                return;
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append("app_id");
            sb2.append(" = ?");
            if (sQLiteDatabaseS0.update("consent_settings", contentValues, sb2.toString(), new String[]{r2}) == 0 && sQLiteDatabaseS0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                this.f84868a.a().m().c("Failed to insert/update table (got -1). key", C11218q2.v("consent_settings"), C11218q2.v("app_id"));
            }
        } catch (SQLiteException e10) {
            this.f84868a.a().m().d("Error storing into table. key", C11218q2.v("consent_settings"), C11218q2.v("app_id"), e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.measurement.internal.C M(java.lang.String r30, java.lang.String r31, java.lang.String r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11242u.M(java.lang.String, java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.C");
    }

    private final t6 P(String str, long j10, byte[] bArr, String str2, String str3, int i10, int i11, long j11, long j12, long j13) {
        if (TextUtils.isEmpty(str2)) {
            this.f84868a.a().t().a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.V2 v22 = (com.google.android.gms.internal.measurement.V2) u6.U(com.google.android.gms.internal.measurement.Y2.L(), bArr);
            Od.G gA = Od.G.a(i10);
            if (gA != Od.G.GOOGLE_SIGNAL && gA != Od.G.GOOGLE_SIGNAL_PENDING && i11 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = v22.t().iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.Z2 z22 = (com.google.android.gms.internal.measurement.Z2) ((C10358a3) it.next()).q();
                    z22.D0(i11);
                    arrayList.add((C10358a3) z22.q());
                }
                v22.z();
                v22.y(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                String[] strArrSplit = str3.split("\r\n");
                int length = strArrSplit.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        break;
                    }
                    String str4 = strArrSplit[i12];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit2 = str4.split("=", 2);
                    if (strArrSplit2.length != 2) {
                        this.f84868a.a().m().b("Invalid upload header: ", str4);
                        break;
                    }
                    map.put(strArrSplit2[0], strArrSplit2[1]);
                    i12++;
                }
            }
            s6 s6Var = new s6();
            s6Var.b(j10);
            s6Var.c((com.google.android.gms.internal.measurement.Y2) v22.q());
            s6Var.d(str2);
            s6Var.e(map);
            s6Var.f(gA);
            s6Var.g(j11);
            s6Var.h(j12);
            s6Var.i(j13);
            s6Var.j(i11);
            return s6Var.a();
        } catch (IOException e10) {
            this.f84868a.a().m().c("Failed to queued MeasurementBatch from upload_queue. appId", str, e10);
            return null;
        }
    }

    private final String Q() {
        X2 x22 = this.f84868a;
        long jA = x22.zzaZ().a();
        Locale locale = Locale.US;
        Od.G g10 = Od.G.GOOGLE_SIGNAL;
        Integer numValueOf = Integer.valueOf(g10.zza());
        Long lValueOf = Long.valueOf(jA);
        x22.u();
        Long l10 = (Long) C11120d2.f85436T.b(null);
        l10.longValue();
        String str = String.format(locale, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", numValueOf, lValueOf, l10);
        Integer numValueOf2 = Integer.valueOf(g10.zza());
        x22.u();
        String str2 = String.format(locale, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", numValueOf2, lValueOf, Long.valueOf(C11187m.o()));
        StringBuilder sb2 = new StringBuilder(str.length() + 5 + str2.length() + 1);
        sb2.append("(");
        sb2.append(str);
        sb2.append(" OR ");
        sb2.append(str2);
        sb2.append(")");
        return sb2.toString();
    }

    static final void m0(ContentValues contentValues, String str, Object obj) {
        com.google.android.gms.common.internal.r.f("value");
        com.google.android.gms.common.internal.r.l(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    public final boolean B() {
        return n0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b6, code lost:
    
        r0 = r8.a().m();
        r8.u();
        r0.b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List B0(java.lang.String r23, java.lang.String r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11242u.B0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Not initialized variable reg: 9, insn: 0x00f6: MOVE (r8 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:247), block:B:29:0x00f6 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C11157i D0(java.lang.String r26, java.lang.String r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11242u.D0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.i");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x011e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a7 A[Catch: SQLiteException -> 0x02c0, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x02c0, blocks: (B:94:0x028c, B:96:0x02a7), top: B:108:0x028c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(java.lang.String r25, java.lang.Long r26, java.lang.String r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11242u.G(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0056, code lost:
    
        r2 = r12.a().m();
        r12.u();
        r2.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List G0(java.lang.String r29, java.lang.String[] r30) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11242u.G0(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0306  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C11259w2 H0(java.lang.String r52) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11242u.H0(java.lang.String):com.google.android.gms.measurement.internal.w2");
    }

    public final void I0(C11259w2 c11259w2, boolean z10, boolean z11) {
        com.google.android.gms.common.internal.r.l(c11259w2);
        f();
        h();
        String strO0 = c11259w2.o0();
        com.google.android.gms.common.internal.r.l(strO0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strO0);
        if (z10) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.f85267b.e(strO0).o(Od.v.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", c11259w2.p0());
        }
        contentValues.put("gmp_app_id", c11259w2.r0());
        q6 q6Var = this.f85267b;
        if (q6Var.e(strO0).o(Od.v.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", c11259w2.v0());
        }
        contentValues.put("last_bundle_index", Long.valueOf(c11259w2.g()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c11259w2.z0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c11259w2.B0()));
        contentValues.put("app_version", c11259w2.D0());
        contentValues.put("app_store", c11259w2.H0());
        contentValues.put("gmp_version", Long.valueOf(c11259w2.J0()));
        contentValues.put("dev_cert_hash", Long.valueOf(c11259w2.L0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c11259w2.d()));
        contentValues.put("day", Long.valueOf(c11259w2.n()));
        contentValues.put("daily_public_events_count", Long.valueOf(c11259w2.p()));
        contentValues.put("daily_events_count", Long.valueOf(c11259w2.r()));
        contentValues.put("daily_conversions_count", Long.valueOf(c11259w2.t()));
        contentValues.put("config_fetched_time", Long.valueOf(c11259w2.h()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(c11259w2.j()));
        contentValues.put("app_version_int", Long.valueOf(c11259w2.F0()));
        contentValues.put("firebase_instance_id", c11259w2.x0());
        contentValues.put("daily_error_events_count", Long.valueOf(c11259w2.x()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(c11259w2.v()));
        contentValues.put("health_monitor_sample", c11259w2.z());
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c11259w2.P()));
        contentValues.put("dynamite_version", Long.valueOf(c11259w2.b()));
        if (q6Var.e(strO0).o(Od.v.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", c11259w2.t0());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c11259w2.V()));
        contentValues.put("target_os_version", Long.valueOf(c11259w2.X()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(c11259w2.Z()));
        C10497p7.a();
        X2 x22 = this.f84868a;
        if (x22.u().F(strO0, C11120d2.f85431Q0)) {
            contentValues.put("ad_services_version", Integer.valueOf(c11259w2.b0()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(c11259w2.j0()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(c11259w2.d0()));
        contentValues.put("npa_metadata_value", c11259w2.R());
        contentValues.put("bundle_delivery_index", Long.valueOf(c11259w2.G()));
        contentValues.put("sgtm_preview_key", c11259w2.l0());
        contentValues.put("dma_consent_state", Integer.valueOf(c11259w2.B()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(c11259w2.D()));
        contentValues.put("serialized_npa_metadata", c11259w2.I());
        contentValues.put("client_upload_eligibility", Integer.valueOf(c11259w2.M()));
        List listT = c11259w2.T();
        if (listT != null) {
            if (listT.isEmpty()) {
                x22.a().p().b("Safelisted events should not be an empty list. appId", strO0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listT));
            }
        }
        Q6.a();
        if (x22.u().F(null, C11120d2.f85421L0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        contentValues.put("unmatched_pfo", c11259w2.f0());
        contentValues.put("unmatched_uwa", c11259w2.h0());
        contentValues.put("ad_campaign_info", c11259w2.K());
        try {
            SQLiteDatabase sQLiteDatabaseS0 = s0();
            if (sQLiteDatabaseS0.update("apps", contentValues, "app_id = ?", new String[]{strO0}) == 0 && sQLiteDatabaseS0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                x22.a().m().b("Failed to insert/update app (got -1). appId", C11218q2.v(strO0));
            }
        } catch (SQLiteException e10) {
            this.f84868a.a().m().c("Error storing app. appId", C11218q2.v(strO0), e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x031c, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x031d, code lost:
    
        r12.put("filter_id", r0);
        r21 = r3;
        r12.put("property_name", r7.G());
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x032f, code lost:
    
        if (r7.K() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0331, code lost:
    
        r0 = java.lang.Boolean.valueOf(r7.L());
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x033a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x033b, code lost:
    
        r12.put("session_scoped", r0);
        r12.put("data", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x034d, code lost:
    
        if (s0().insertWithOnConflict("property_filters", null, r12, 5) != (-1)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x034f, code lost:
    
        r22.f84868a.a().m().b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.C11218q2.v(r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0363, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0365, code lost:
    
        r0 = r19;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x036b, code lost:
    
        r22.f84868a.a().m().c("Error storing property filter. appId", com.google.android.gms.measurement.internal.C11218q2.v(r23), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x037e, code lost:
    
        h();
        f();
        com.google.android.gms.common.internal.r.f(r23);
        r0 = s0();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r23, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r23, java.lang.String.valueOf(r10)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x03a1, code lost:
    
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0494, code lost:
    
        r20.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0497, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0176, code lost:
    
        r11 = r0.G().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0182, code lost:
    
        if (r11.hasNext() == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x018e, code lost:
    
        if (((com.google.android.gms.internal.measurement.H1) r11.next()).E() != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0190, code lost:
    
        r22.f84868a.a().p().c("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.C11218q2.v(r23), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a9, code lost:
    
        r11 = r0.J().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01b5, code lost:
    
        r19 = r0;
        r0 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c3, code lost:
    
        if (r11.hasNext() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c5, code lost:
    
        r12 = (com.google.android.gms.internal.measurement.C10580z1) r11.next();
        h();
        f();
        com.google.android.gms.common.internal.r.f(r23);
        com.google.android.gms.common.internal.r.l(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01df, code lost:
    
        if (r12.G().isEmpty() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e1, code lost:
    
        r0 = r22.f84868a.a().p();
        r11 = com.google.android.gms.measurement.internal.C11218q2.v(r23);
        r13 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f9, code lost:
    
        if (r12.E() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01fb, code lost:
    
        r16 = java.lang.Integer.valueOf(r12.F());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0206, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0208, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r11, r13, java.lang.String.valueOf(r16));
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0213, code lost:
    
        r3 = r12.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0217, code lost:
    
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0219, code lost:
    
        r7 = new android.content.ContentValues();
        r7.put("app_id", r23);
        r7.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x022c, code lost:
    
        if (r12.E() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x022e, code lost:
    
        r0 = java.lang.Integer.valueOf(r12.F());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0237, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x023a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x023b, code lost:
    
        r7.put("filter_id", r0);
        r7.put("event_name", r12.G());
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x024b, code lost:
    
        if (r12.O() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x024d, code lost:
    
        r0 = java.lang.Boolean.valueOf(r12.P());
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0256, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0257, code lost:
    
        r7.put("session_scoped", r0);
        r7.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0269, code lost:
    
        if (s0().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x026b, code lost:
    
        r22.f84868a.a().m().b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.C11218q2.v(r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x027e, code lost:
    
        r0 = r19;
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0286, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0287, code lost:
    
        r22.f84868a.a().m().c("Error storing event filter. appId", com.google.android.gms.measurement.internal.C11218q2.v(r23), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x029c, code lost:
    
        r20 = r7;
        r3 = r19.G().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02aa, code lost:
    
        if (r3.hasNext() == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02ac, code lost:
    
        r7 = (com.google.android.gms.internal.measurement.H1) r3.next();
        h();
        f();
        com.google.android.gms.common.internal.r.f(r23);
        com.google.android.gms.common.internal.r.l(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02c6, code lost:
    
        if (r7.G().isEmpty() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02c8, code lost:
    
        r0 = r22.f84868a.a().p();
        r9 = com.google.android.gms.measurement.internal.C11218q2.v(r23);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02e0, code lost:
    
        if (r7.E() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02e2, code lost:
    
        r16 = java.lang.Integer.valueOf(r7.F());
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02ed, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02ef, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02f8, code lost:
    
        r11 = r7.g();
        r12 = new android.content.ContentValues();
        r12.put(r0, r23);
        r19 = r0;
        r12.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0311, code lost:
    
        if (r7.E() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0313, code lost:
    
        r0 = java.lang.Integer.valueOf(r7.F());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void W(java.lang.String r23, java.util.List r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11242u.W(java.lang.String, java.util.List):void");
    }

    final C X(String str, com.google.android.gms.internal.measurement.O2 o22, String str2) throws Throwable {
        C cM = M("events", str, o22.H());
        if (cM == null) {
            X2 x22 = this.f84868a;
            x22.a().p().c("Event aggregate wasn't created during raw event logging. appId, event", C11218q2.v(str), x22.B().a(str2));
            return new C(str, o22.H(), 1L, 1L, 1L, o22.J(), 0L, null, null, null, null);
        }
        long j10 = cM.f84933e + 1;
        long j11 = cM.f84932d + 1;
        return new C(cM.f84929a, cM.f84930b, cM.f84931c + 1, j11, j10, cM.f84934f, cM.f84935g, cM.f84936h, cM.f84937i, cM.f84938j, cM.f84939k);
    }

    protected final boolean Y() {
        X2 x22 = this.f84868a;
        Context contextZzaY = x22.zzaY();
        x22.u();
        return contextZzaY.getDatabasePath("google_app_measurement.db").exists();
    }

    public final long k(String str, com.google.android.gms.internal.measurement.Y2 y22, String str2, Map map, Od.G g10, Long l10) {
        int iDelete;
        f();
        h();
        com.google.android.gms.common.internal.r.l(y22);
        com.google.android.gms.common.internal.r.f(str);
        f();
        h();
        if (Y()) {
            q6 q6Var = this.f85267b;
            long jA = q6Var.J0().f86050f.a();
            X2 x22 = this.f84868a;
            long jC = x22.zzaZ().c();
            long jAbs = Math.abs(jC - jA);
            x22.u();
            if (jAbs > C11187m.p()) {
                q6Var.J0().f86050f.b(jC);
                f();
                h();
                if (Y() && (iDelete = s0().delete("upload_queue", Q(), new String[0])) > 0) {
                    x22.a().u().b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(iDelete));
                }
                com.google.android.gms.common.internal.r.f(str);
                f();
                h();
                try {
                    int iC = x22.u().C(str, C11120d2.f85398A);
                    if (iC > 0) {
                        s0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iC)});
                    }
                } catch (SQLiteException e10) {
                    this.f84868a.a().m().c("Error deleting over the limit queued batches. appId", C11218q2.v(str), e10);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append("=");
            sb2.append(str4);
            arrayList.add(sb2.toString());
        }
        byte[] bArrG = y22.g();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrG);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", F.k0.a("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(g10.zza()));
        X2 x23 = this.f84868a;
        contentValues.put("creation_timestamp", Long.valueOf(x23.zzaZ().a()));
        contentValues.put("retry_count", (Integer) 0);
        if (l10 != null) {
            contentValues.put("associated_row_id", l10);
        }
        try {
            long jInsert = s0().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            x23.a().m().b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return -1L;
        } catch (SQLiteException e11) {
            this.f84868a.a().m().c("Error storing MeasurementBatch to upload_queue. appId", str, e11);
            return -1L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5 A[Catch: all -> 0x0078, SQLiteException -> 0x007a, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x0070, B:45:0x00ce, B:47:0x00f5, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0137, B:56:0x0151, B:68:0x0178, B:71:0x0180, B:77:0x01a0, B:61:0x0167, B:75:0x0192, B:76:0x019b, B:98:0x0221), top: B:112:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a A[Catch: all -> 0x0078, SQLiteException -> 0x007a, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x0070, B:45:0x00ce, B:47:0x00f5, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0137, B:56:0x0151, B:68:0x0178, B:71:0x0180, B:77:0x01a0, B:61:0x0167, B:75:0x0192, B:76:0x019b, B:98:0x0221), top: B:112:0x0070 }] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l0(java.lang.String r20, long r21, long r23, com.google.android.gms.measurement.internal.m6 r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11242u.l0(java.lang.String, long, long, com.google.android.gms.measurement.internal.m6):void");
    }

    public final boolean n(String str) {
        Od.G[] gArr = {Od.G.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(gArr[0].zza()));
        String strR = R(arrayList);
        String strQ = Q();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strR).length() + 61 + strQ.length());
        sb2.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb2.append(strR);
        sb2.append(" AND NOT ");
        sb2.append(strQ);
        return n0(sb2.toString(), new String[]{str}) != 0;
    }

    public final boolean q() {
        return n0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final C t0(String str, String str2) {
        return M("events", str, str2);
    }

    public final void u0(C c10) {
        N("events", c10);
    }

    public final void v0(String str) {
        C cM;
        O("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = s0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (cM = M("events", str, string)) != null) {
                            N("events_snapshot", cM);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e10) {
                this.f84868a.a().m().c("Error creating snapshot. appId", C11218q2.v(str), e10);
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w0(java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11242u.w0(java.lang.String):void");
    }

    public final boolean z() {
        return n0("select count(1) > 0 from raw_events", null) != 0;
    }

    C11242u(q6 q6Var) {
        super(q6Var);
        this.f85899e = new R5(this.f84868a.zzaZ());
        this.f84868a.u();
        this.f85898d = new C11235t(this, this.f84868a.zzaY(), "google_app_measurement.db");
    }

    private final String K(String str, String[] strArr, String str2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = s0().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    String string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                    return string;
                }
                cursorRawQuery.close();
                return "";
            } catch (SQLiteException e10) {
                this.f84868a.a().m().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    private final void N(String str, C c10) {
        Long l10;
        com.google.android.gms.common.internal.r.l(c10);
        f();
        h();
        ContentValues contentValues = new ContentValues();
        String str2 = c10.f84929a;
        contentValues.put("app_id", str2);
        contentValues.put("name", c10.f84930b);
        contentValues.put("lifetime_count", Long.valueOf(c10.f84931c));
        contentValues.put("current_bundle_count", Long.valueOf(c10.f84932d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c10.f84934f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c10.f84935g));
        contentValues.put("last_bundled_day", c10.f84936h);
        contentValues.put("last_sampled_complex_event_id", c10.f84937i);
        contentValues.put("last_sampling_rate", c10.f84938j);
        contentValues.put("current_session_count", Long.valueOf(c10.f84933e));
        Boolean bool = c10.f84939k;
        if (bool != null && bool.booleanValue()) {
            l10 = 1L;
        } else {
            l10 = null;
        }
        contentValues.put("last_exempt_from_sampling", l10);
        try {
            if (s0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                this.f84868a.a().m().b("Failed to insert/update event aggregates (got -1). appId", C11218q2.v(str2));
            }
        } catch (SQLiteException e10) {
            this.f84868a.a().m().c("Error storing event aggregates. appId", C11218q2.v(c10.f84929a), e10);
        }
    }

    private final void O(String str, String str2) {
        com.google.android.gms.common.internal.r.f(str2);
        f();
        h();
        try {
            s0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e10) {
            this.f84868a.a().m().c("Error deleting snapshot. appId", C11218q2.v(str2), e10);
        }
    }

    private static final String R(List list) {
        if (list.isEmpty()) {
            return "";
        }
        return String.format(" AND (upload_type IN (%s))", TextUtils.join(", ", list));
    }

    private final long n0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = s0().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    long j10 = cursorRawQuery.getLong(0);
                    cursorRawQuery.close();
                    return j10;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e10) {
                this.f84868a.a().m().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    private final long o0(String str, String[] strArr, long j10) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = s0().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j10 = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                this.f84868a.a().m().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    public final boolean A(String str, String str2) {
        if (n0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List A0(java.lang.String r13) {
        /*
            r12 = this;
            com.google.android.gms.common.internal.r.f(r13)
            r12.f()
            r12.h()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r9 = "1000"
            r10 = 0
            android.database.sqlite.SQLiteDatabase r1 = r12.s0()     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L85
            java.lang.String r2 = "user_attributes"
            java.lang.String r3 = "name"
            java.lang.String r4 = "origin"
            java.lang.String r5 = "set_timestamp"
            java.lang.String r6 = "value"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5, r6}     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L85
            java.lang.String r4 = "app_id=?"
            java.lang.String[] r5 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L85
            java.lang.String r8 = "rowid"
            com.google.android.gms.measurement.internal.X2 r11 = r12.f84868a     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L85
            r11.u()     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L85
            r6 = 0
            r7 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L85
            boolean r1 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            if (r1 == 0) goto L9d
        L3c:
            r1 = 0
            java.lang.String r5 = r10.getString(r1)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            r1 = 1
            java.lang.String r1 = r10.getString(r1)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            if (r1 != 0) goto L4a
            java.lang.String r1 = ""
        L4a:
            r4 = r1
            goto L52
        L4c:
            r0 = move-exception
            r13 = r0
            goto La3
        L4f:
            r0 = move-exception
            r3 = r13
            goto L88
        L52:
            r1 = 2
            long r6 = r10.getLong(r1)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            r1 = 3
            java.lang.Object r8 = r12.v(r10, r1)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            if (r8 != 0) goto L71
            com.google.android.gms.measurement.internal.q2 r1 = r11.a()     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            com.google.android.gms.measurement.internal.o2 r1 = r1.m()     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            java.lang.String r2 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C11218q2.v(r13)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            r1.b(r2, r3)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            r3 = r13
            goto L7a
        L71:
            com.google.android.gms.measurement.internal.x6 r2 = new com.google.android.gms.measurement.internal.x6     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L4f
            r3 = r13
            r2.<init>(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L83
            r0.add(r2)     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L83
        L7a:
            boolean r13 = r10.moveToNext()     // Catch: java.lang.Throwable -> L4c android.database.sqlite.SQLiteException -> L83
            if (r13 != 0) goto L81
            goto L9d
        L81:
            r13 = r3
            goto L3c
        L83:
            r0 = move-exception
            goto L88
        L85:
            r0 = move-exception
            r3 = r13
            r13 = r0
        L88:
            com.google.android.gms.measurement.internal.X2 r13 = r12.f84868a     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.measurement.internal.q2 r13 = r13.a()     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.measurement.internal.o2 r13 = r13.m()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = "Error querying user properties. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C11218q2.v(r3)     // Catch: java.lang.Throwable -> L4c
            r13.c(r1, r2, r0)     // Catch: java.lang.Throwable -> L4c
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L4c
        L9d:
            if (r10 == 0) goto La2
            r10.close()
        La2:
            return r0
        La3:
            if (r10 == 0) goto La8
            r10.close()
        La8:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11242u.A0(java.lang.String):java.util.List");
    }

    public final long C(String str) {
        com.google.android.gms.common.internal.r.f(str);
        return o0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final boolean C0(C11157i c11157i) {
        com.google.android.gms.common.internal.r.l(c11157i);
        f();
        h();
        String str = c11157i.f85608a;
        com.google.android.gms.common.internal.r.l(str);
        if (z0(str, c11157i.f85610c.f85926b) == null) {
            long jN0 = n0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f84868a.u();
            if (jN0 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c11157i.f85609b);
        contentValues.put("name", c11157i.f85610c.f85926b);
        m0(contentValues, "value", com.google.android.gms.common.internal.r.l(c11157i.f85610c.B()));
        contentValues.put("active", Boolean.valueOf(c11157i.f85612e));
        contentValues.put("trigger_event_name", c11157i.f85613f);
        contentValues.put("trigger_timeout", Long.valueOf(c11157i.f85615h));
        X2 x22 = this.f84868a;
        contentValues.put("timed_out_event", x22.A().R(c11157i.f85614g));
        contentValues.put("creation_timestamp", Long.valueOf(c11157i.f85611d));
        contentValues.put("triggered_event", x22.A().R(c11157i.f85616i));
        contentValues.put("triggered_timestamp", Long.valueOf(c11157i.f85610c.f85927c));
        contentValues.put("time_to_live", Long.valueOf(c11157i.f85617j));
        contentValues.put("expired_event", x22.A().R(c11157i.f85618k));
        try {
            if (s0().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                x22.a().m().b("Failed to insert/update conditional user property (got -1)", C11218q2.v(str));
                return true;
            }
            return true;
        } catch (SQLiteException e10) {
            this.f84868a.a().m().c("Error storing conditional user property", C11218q2.v(str), e10);
            return true;
        }
    }

    public final boolean D(String str, Long l10, long j10, com.google.android.gms.internal.measurement.O2 o22) {
        f();
        h();
        com.google.android.gms.common.internal.r.l(o22);
        com.google.android.gms.common.internal.r.f(str);
        com.google.android.gms.common.internal.r.l(l10);
        X2 x22 = this.f84868a;
        byte[] bArrG = o22.g();
        x22.a().u().c("Saving complex main event, appId, data size", x22.B().a(str), Integer.valueOf(bArrG.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", bArrG);
        try {
            if (s0().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                x22.a().m().b("Failed to insert complex main event (got -1). appId", C11218q2.v(str));
                return false;
            }
            return true;
        } catch (SQLiteException e10) {
            this.f84868a.a().m().c("Error storing complex main event. appId", C11218q2.v(str), e10);
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:107), block:B:19:0x006a */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle E(java.lang.String r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r5.f()
            r5.h()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.s0()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            if (r2 != 0) goto L2f
            com.google.android.gms.measurement.internal.X2 r6 = r5.f84868a     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            com.google.android.gms.measurement.internal.q2 r6 = r6.a()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            com.google.android.gms.measurement.internal.o2 r6 = r6.u()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            java.lang.String r2 = "Default event parameters not found"
            r6.a(r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            goto L7f
        L2b:
            r6 = move-exception
            goto L6a
        L2d:
            r6 = move-exception
            goto L70
        L2f:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            com.google.android.gms.internal.measurement.N2 r3 = com.google.android.gms.internal.measurement.O2.O()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.J5 r2 = com.google.android.gms.measurement.internal.u6.U(r3, r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.N2 r2 = (com.google.android.gms.internal.measurement.N2) r2     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.e5 r2 = r2.q()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.O2 r2 = (com.google.android.gms.internal.measurement.O2) r2     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.measurement.internal.q6 r6 = r5.f85267b     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            r6.I0()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            java.util.List r6 = r2.E()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            android.os.Bundle r6 = com.google.android.gms.measurement.internal.u6.o(r6)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            r1.close()
            return r6
        L55:
            r2 = move-exception
            com.google.android.gms.measurement.internal.X2 r3 = r5.f84868a     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            com.google.android.gms.measurement.internal.q2 r3 = r3.a()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            com.google.android.gms.measurement.internal.o2 r3 = r3.m()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C11218q2.v(r6)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            r3.c(r4, r6, r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            goto L7f
        L6a:
            r0 = r1
            goto L85
        L6c:
            r6 = move-exception
            goto L85
        L6e:
            r6 = move-exception
            r1 = r0
        L70:
            com.google.android.gms.measurement.internal.X2 r2 = r5.f84868a     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.measurement.internal.q2 r2 = r2.a()     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.measurement.internal.o2 r2 = r2.m()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r6)     // Catch: java.lang.Throwable -> L2b
        L7f:
            if (r1 == 0) goto L84
            r1.close()
        L84:
            return r0
        L85:
            if (r0 == 0) goto L8a
            r0.close()
        L8a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11242u.E(java.lang.String):android.os.Bundle");
    }

    public final int E0(String str, String str2) {
        com.google.android.gms.common.internal.r.f(str);
        com.google.android.gms.common.internal.r.f(str2);
        f();
        h();
        try {
            return s0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            X2 x22 = this.f84868a;
            x22.a().m().d("Error deleting conditional property", C11218q2.v(str), x22.B().c(str2), e10);
            return 0;
        }
    }

    public final List F0(String str, String str2, String str3) {
        com.google.android.gms.common.internal.r.f(str);
        f();
        h();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return G0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.E3 H(java.lang.String r5) {
        /*
            r4 = this;
            com.google.android.gms.common.internal.r.l(r5)
            r4.f()
            r4.h()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.String r0 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r4.s0()     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L49
            android.database.Cursor r5 = r2.rawQuery(r0, r5)     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L49
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            if (r0 != 0) goto L35
            com.google.android.gms.measurement.internal.X2 r0 = r4.f84868a     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.q2 r0 = r0.a()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.o2 r0 = r0.u()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            java.lang.String r2 = "No data found"
            r0.a(r2)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
        L2d:
            r5.close()
            goto L5e
        L31:
            r0 = move-exception
            goto L44
        L33:
            r0 = move-exception
            goto L4c
        L35:
            r0 = 0
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            r2 = 1
            int r2 = r5.getInt(r2)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.E3 r1 = com.google.android.gms.measurement.internal.E3.f(r0, r2)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            goto L2d
        L44:
            r1 = r5
            goto L64
        L46:
            r5 = move-exception
            r0 = r5
            goto L64
        L49:
            r5 = move-exception
            r0 = r5
            r5 = r1
        L4c:
            com.google.android.gms.measurement.internal.X2 r2 = r4.f84868a     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.measurement.internal.q2 r2 = r2.a()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.measurement.internal.o2 r2 = r2.m()     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = "Error querying database."
            r2.b(r3, r0)     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L5e
            goto L2d
        L5e:
            if (r1 != 0) goto L63
            com.google.android.gms.measurement.internal.E3 r5 = com.google.android.gms.measurement.internal.E3.f84995c
            return r5
        L63:
            return r1
        L64:
            if (r1 == 0) goto L69
            r1.close()
        L69:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11242u.H(java.lang.String):com.google.android.gms.measurement.internal.E3");
    }

    public final boolean I(String str, S5 s52) {
        f();
        h();
        com.google.android.gms.common.internal.r.l(s52);
        com.google.android.gms.common.internal.r.f(str);
        X2 x22 = this.f84868a;
        long jA = x22.zzaZ().a();
        C11112c2 c11112c2 = C11120d2.f85507w0;
        long jLongValue = jA - ((Long) c11112c2.b(null)).longValue();
        long j10 = s52.f85220b;
        if (j10 < jLongValue || j10 > ((Long) c11112c2.b(null)).longValue() + jA) {
            x22.a().p().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", C11218q2.v(str), Long.valueOf(jA), Long.valueOf(j10));
        }
        x22.a().u().a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", s52.f85219a);
        contentValues.put("source", Integer.valueOf(s52.f85221c));
        contentValues.put("timestamp_millis", Long.valueOf(j10));
        try {
            if (s0().insert("trigger_uris", null, contentValues) == -1) {
                x22.a().m().b("Failed to insert trigger URI (got -1). appId", C11218q2.v(str));
                return false;
            }
            return true;
        } catch (SQLiteException e10) {
            this.f84868a.a().m().c("Error storing trigger URI. appId", C11218q2.v(str), e10);
            return false;
        }
    }

    public final void J(String str, E3 e32) {
        com.google.android.gms.common.internal.r.l(str);
        com.google.android.gms.common.internal.r.l(e32);
        f();
        h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", e32.l());
        contentValues.put("consent_source", Integer.valueOf(e32.b()));
        L("consent_settings", "app_id", contentValues);
    }

    public final C11215q K0(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        com.google.android.gms.common.internal.r.f(str);
        f();
        h();
        String[] strArr = {str};
        C11215q c11215q = new C11215q();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseS0 = s0();
                cursorQuery = sQLiteDatabaseS0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    this.f84868a.a().p().b("Not updating daily counts, app is not known. appId", C11218q2.v(str));
                } else {
                    if (cursorQuery.getLong(0) == j10) {
                        c11215q.f85757b = cursorQuery.getLong(1);
                        c11215q.f85756a = cursorQuery.getLong(2);
                        c11215q.f85758c = cursorQuery.getLong(3);
                        c11215q.f85759d = cursorQuery.getLong(4);
                        c11215q.f85760e = cursorQuery.getLong(5);
                        c11215q.f85761f = cursorQuery.getLong(6);
                        c11215q.f85762g = cursorQuery.getLong(7);
                    }
                    if (z10) {
                        c11215q.f85757b += j11;
                    }
                    if (z11) {
                        c11215q.f85756a += j11;
                    }
                    if (z12) {
                        c11215q.f85758c += j11;
                    }
                    if (z13) {
                        c11215q.f85759d += j11;
                    }
                    if (z14) {
                        c11215q.f85760e += j11;
                    }
                    if (z15) {
                        c11215q.f85761f += j11;
                    }
                    if (z16) {
                        c11215q.f85762g += j11;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j10));
                    contentValues.put("daily_public_events_count", Long.valueOf(c11215q.f85756a));
                    contentValues.put("daily_events_count", Long.valueOf(c11215q.f85757b));
                    contentValues.put("daily_conversions_count", Long.valueOf(c11215q.f85758c));
                    contentValues.put("daily_error_events_count", Long.valueOf(c11215q.f85759d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(c11215q.f85760e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(c11215q.f85761f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(c11215q.f85762g));
                    sQLiteDatabaseS0.update("apps", contentValues, "app_id=?", strArr);
                }
            } catch (SQLiteException e10) {
                this.f84868a.a().m().c("Error updating daily counts. appId", C11218q2.v(str), e10);
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return c11215q;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C11208p L0(java.lang.String r11) throws java.lang.Throwable {
        /*
            r10 = this;
            com.google.android.gms.common.internal.r.f(r11)
            r10.f()
            r10.h()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.s0()     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteException -> L6d
            java.lang.String r3 = "apps"
            java.lang.String r0 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r4 = new java.lang.String[]{r0, r4, r5}     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteException -> L6d
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteException -> L6d
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteException -> L6d
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            if (r0 != 0) goto L2e
            goto L82
        L2e:
            r0 = 0
            byte[] r0 = r2.getBlob(r0)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            r3 = 1
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            r4 = 2
            java.lang.String r4 = r2.getString(r4)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            boolean r5 = r2.moveToNext()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            if (r5 == 0) goto L5c
            com.google.android.gms.measurement.internal.X2 r5 = r10.f84868a     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            com.google.android.gms.measurement.internal.q2 r5 = r5.a()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            com.google.android.gms.measurement.internal.o2 r5 = r5.m()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C11218q2.v(r11)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            r5.b(r6, r7)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            goto L5c
        L57:
            r0 = move-exception
            r11 = r0
            goto L68
        L5a:
            r0 = move-exception
            goto L6f
        L5c:
            if (r0 != 0) goto L5f
            goto L82
        L5f:
            com.google.android.gms.measurement.internal.p r5 = new com.google.android.gms.measurement.internal.p     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            r5.<init>(r0, r3, r4)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            r2.close()
            return r5
        L68:
            r1 = r2
            goto L88
        L6a:
            r0 = move-exception
            r11 = r0
            goto L88
        L6d:
            r0 = move-exception
            r2 = r1
        L6f:
            com.google.android.gms.measurement.internal.X2 r3 = r10.f84868a     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.q2 r3 = r3.a()     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.o2 r3 = r3.m()     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C11218q2.v(r11)     // Catch: java.lang.Throwable -> L57
            r3.c(r4, r11, r0)     // Catch: java.lang.Throwable -> L57
        L82:
            if (r2 == 0) goto L87
            r2.close()
        L87:
            return r1
        L88:
            if (r1 == 0) goto L8d
            r1.close()
        L8d:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11242u.L0(java.lang.String):com.google.android.gms.measurement.internal.p");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean M0(com.google.android.gms.internal.measurement.C10358a3 r8, boolean r9) {
        /*
            r7 = this;
            r7.f()
            r7.h()
            com.google.android.gms.common.internal.r.l(r8)
            java.lang.String r0 = r8.E()
            com.google.android.gms.common.internal.r.f(r0)
            boolean r0 = r8.u2()
            com.google.android.gms.common.internal.r.p(r0)
            r7.s()
            com.google.android.gms.measurement.internal.X2 r0 = r7.f84868a
            com.google.android.gms.common.util.f r1 = r0.zzaZ()
            long r1 = r1.a()
            long r3 = r8.v2()
            r0.u()
            long r5 = com.google.android.gms.measurement.internal.C11187m.o()
            long r5 = r1 - r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L45
            long r3 = r8.v2()
            r0.u()
            long r5 = com.google.android.gms.measurement.internal.C11187m.o()
            long r5 = r5 + r1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L66
        L45:
            com.google.android.gms.measurement.internal.q2 r0 = r0.a()
            com.google.android.gms.measurement.internal.o2 r0 = r0.p()
            java.lang.String r3 = r8.E()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C11218q2.v(r3)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            long r4 = r8.v2()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            r0.d(r4, r3, r1, r2)
        L66:
            byte[] r0 = r8.g()
            r1 = 0
            com.google.android.gms.measurement.internal.q6 r2 = r7.f85267b     // Catch: java.io.IOException -> L108
            com.google.android.gms.measurement.internal.u6 r2 = r2.I0()     // Catch: java.io.IOException -> L108
            byte[] r0 = r2.T(r0)     // Catch: java.io.IOException -> L108
            com.google.android.gms.measurement.internal.X2 r2 = r7.f84868a
            com.google.android.gms.measurement.internal.q2 r3 = r2.a()
            com.google.android.gms.measurement.internal.o2 r3 = r3.u()
            int r4 = r0.length
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Saving bundle, size"
            r3.b(r5, r4)
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.String r4 = r8.E()
            java.lang.String r5 = "app_id"
            r3.put(r5, r4)
            long r4 = r8.v2()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "bundle_end_timestamp"
            r3.put(r5, r4)
            java.lang.String r4 = "data"
            r3.put(r4, r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r0 = "has_realtime"
            r3.put(r0, r9)
            boolean r9 = r8.F0()
            if (r9 == 0) goto Lc5
            int r9 = r8.G0()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r0 = "retry_count"
            r3.put(r0, r9)
        Lc5:
            android.database.sqlite.SQLiteDatabase r9 = r7.s0()     // Catch: android.database.sqlite.SQLiteException -> Lec
            java.lang.String r0 = "queue"
            r4 = 0
            long r3 = r9.insert(r0, r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lec
            r5 = -1
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 != 0) goto Lee
            com.google.android.gms.measurement.internal.q2 r9 = r2.a()     // Catch: android.database.sqlite.SQLiteException -> Lec
            com.google.android.gms.measurement.internal.o2 r9 = r9.m()     // Catch: android.database.sqlite.SQLiteException -> Lec
            java.lang.String r0 = "Failed to insert bundle (got -1). appId"
            java.lang.String r2 = r8.E()     // Catch: android.database.sqlite.SQLiteException -> Lec
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C11218q2.v(r2)     // Catch: android.database.sqlite.SQLiteException -> Lec
            r9.b(r0, r2)     // Catch: android.database.sqlite.SQLiteException -> Lec
            return r1
        Lec:
            r9 = move-exception
            goto Lf0
        Lee:
            r8 = 1
            return r8
        Lf0:
            com.google.android.gms.measurement.internal.X2 r0 = r7.f84868a
            com.google.android.gms.measurement.internal.q2 r0 = r0.a()
            com.google.android.gms.measurement.internal.o2 r0 = r0.m()
            java.lang.String r8 = r8.E()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C11218q2.v(r8)
            java.lang.String r2 = "Error storing bundle. appId"
            r0.c(r2, r8, r9)
            return r1
        L108:
            r9 = move-exception
            com.google.android.gms.measurement.internal.X2 r0 = r7.f84868a
            com.google.android.gms.measurement.internal.q2 r0 = r0.a()
            com.google.android.gms.measurement.internal.o2 r0 = r0.m()
            java.lang.String r8 = r8.E()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C11218q2.v(r8)
            java.lang.String r2 = "Data loss. Failed to serialize bundle. appId"
            r0.c(r2, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11242u.M0(com.google.android.gms.internal.measurement.a3, boolean):boolean");
    }

    public final C11270y S(String str) {
        com.google.android.gms.common.internal.r.l(str);
        f();
        h();
        return C11270y.g(K("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final void T(String str, C11270y c11270y) {
        com.google.android.gms.common.internal.r.l(str);
        com.google.android.gms.common.internal.r.l(c11270y);
        f();
        h();
        E3 e3H = H(str);
        E3 e32 = E3.f84995c;
        if (e3H == e32) {
            J(str, e32);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", c11270y.e());
        L("consent_settings", "app_id", contentValues);
    }

    public final void U(String str, E3 e32) {
        com.google.android.gms.common.internal.r.l(str);
        com.google.android.gms.common.internal.r.l(e32);
        f();
        h();
        J(str, H(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", e32.l());
        L("consent_settings", "app_id", contentValues);
    }

    public final E3 V(String str) {
        com.google.android.gms.common.internal.r.l(str);
        f();
        h();
        return E3.f(K("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""), 100);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.t6 l(long r19) {
        /*
            r18 = this;
            r18.f()
            r18.h()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r18.s0()     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String r3 = "upload_queue"
            java.lang.String r4 = "rowId"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "measurement_batch"
            java.lang.String r7 = "upload_uri"
            java.lang.String r8 = "upload_headers"
            java.lang.String r9 = "upload_type"
            java.lang.String r10 = "retry_count"
            java.lang.String r11 = "creation_timestamp"
            java.lang.String r12 = "associated_row_id"
            java.lang.String r13 = "last_upload_timestamp"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String r5 = "rowId=?"
            java.lang.String r0 = java.lang.String.valueOf(r19)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String[] r6 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String r10 = "1"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            if (r0 != 0) goto L42
            r3 = r18
            goto Lab
        L42:
            r0 = 1
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            java.lang.Object r0 = com.google.android.gms.common.internal.r.l(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 2
            byte[] r7 = r2.getBlob(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 3
            java.lang.String r8 = r2.getString(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 4
            java.lang.String r9 = r2.getString(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 5
            int r10 = r2.getInt(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 6
            int r11 = r2.getInt(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 7
            long r12 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 8
            long r14 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 9
            long r16 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r3 = r18
            r5 = r19
            com.google.android.gms.measurement.internal.t6 r0 = r3.P(r4, r5, r7, r8, r9, r10, r11, r12, r14, r16)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r2.close()
            return r0
        L84:
            r0 = move-exception
            goto L88
        L86:
            r0 = move-exception
            goto L8c
        L88:
            r3 = r18
        L8a:
            r1 = r2
            goto Lb3
        L8c:
            r3 = r18
            goto L98
        L8f:
            r0 = move-exception
            goto L93
        L91:
            r0 = move-exception
            goto L96
        L93:
            r3 = r18
            goto Lb3
        L96:
            r2 = r1
            goto L8c
        L98:
            com.google.android.gms.measurement.internal.X2 r4 = r3.f84868a     // Catch: java.lang.Throwable -> Lb1
            com.google.android.gms.measurement.internal.q2 r4 = r4.a()     // Catch: java.lang.Throwable -> Lb1
            com.google.android.gms.measurement.internal.o2 r4 = r4.m()     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r5 = "Error to querying MeasurementBatch from upload_queue. rowId"
            java.lang.Long r6 = java.lang.Long.valueOf(r19)     // Catch: java.lang.Throwable -> Lb1
            r4.c(r5, r6, r0)     // Catch: java.lang.Throwable -> Lb1
        Lab:
            if (r2 == 0) goto Lb0
            r2.close()
        Lb0:
            return r1
        Lb1:
            r0 = move-exception
            goto L8a
        Lb3:
            if (r1 == 0) goto Lb8
            r1.close()
        Lb8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11242u.l(long):com.google.android.gms.measurement.internal.t6");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m(java.lang.String r19, Od.J r20, int r21) {
        /*
            r18 = this;
            com.google.android.gms.common.internal.r.f(r19)
            r18.f()
            r18.h()
            java.lang.String r0 = " AND NOT "
            java.lang.String r1 = "app_id=?"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r18.s0()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String r4 = "upload_queue"
            java.lang.String r5 = "rowId"
            java.lang.String r6 = "app_id"
            java.lang.String r7 = "measurement_batch"
            java.lang.String r8 = "upload_uri"
            java.lang.String r9 = "upload_headers"
            java.lang.String r10 = "upload_type"
            java.lang.String r11 = "retry_count"
            java.lang.String r12 = "creation_timestamp"
            java.lang.String r13 = "associated_row_id"
            java.lang.String r14 = "last_upload_timestamp"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r6 = r20
            java.util.List r6 = r6.f23568a     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String r6 = R(r6)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String r7 = r18.Q()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String r8 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            int r8 = r8.length()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            int r8 = r8 + 17
            int r9 = r7.length()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r9.<init>(r8)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r9.append(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r9.append(r6)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r9.append(r7)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String[] r7 = new java.lang.String[]{r19}     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String r10 = "creation_timestamp ASC"
            if (r21 <= 0) goto L6a
            java.lang.String r0 = java.lang.String.valueOf(r21)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r11 = r0
            goto L6b
        L6a:
            r11 = r2
        L6b:
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r0.<init>()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
        L76:
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            if (r1 == 0) goto Lbd
            r1 = 0
            long r5 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 2
            byte[] r7 = r2.getBlob(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 3
            java.lang.String r8 = r2.getString(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 4
            java.lang.String r9 = r2.getString(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 5
            int r10 = r2.getInt(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 6
            int r11 = r2.getInt(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 7
            long r12 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 8
            long r14 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 9
            long r16 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r3 = r18
            r4 = r19
            com.google.android.gms.measurement.internal.t6 r1 = r3.P(r4, r5, r7, r8, r9, r10, r11, r12, r14, r16)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            if (r1 == 0) goto L76
            r0.add(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            goto L76
        Lb9:
            r0 = move-exception
            goto Lc0
        Lbb:
            r0 = move-exception
            goto Lc3
        Lbd:
            r3 = r18
            goto Ld8
        Lc0:
            r3 = r18
            goto Ldf
        Lc3:
            r3 = r18
            com.google.android.gms.measurement.internal.X2 r1 = r3.f84868a     // Catch: java.lang.Throwable -> Lde
            com.google.android.gms.measurement.internal.q2 r1 = r1.a()     // Catch: java.lang.Throwable -> Lde
            com.google.android.gms.measurement.internal.o2 r1 = r1.m()     // Catch: java.lang.Throwable -> Lde
            java.lang.String r4 = "Error to querying MeasurementBatch from upload_queue. appId"
            r5 = r19
            r1.c(r4, r5, r0)     // Catch: java.lang.Throwable -> Lde
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> Lde
        Ld8:
            if (r2 == 0) goto Ldd
            r2.close()
        Ldd:
            return r0
        Lde:
            r0 = move-exception
        Ldf:
            if (r2 == 0) goto Le4
            r2.close()
        Le4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11242u.m(java.lang.String, Od.J, int):java.util.List");
    }

    public final void o(Long l10) {
        f();
        h();
        com.google.android.gms.common.internal.r.l(l10);
        try {
            if (s0().delete("upload_queue", "rowid=?", new String[]{l10.toString()}) != 1) {
                this.f84868a.a().p().a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e10) {
            this.f84868a.a().m().b("Failed to delete a MeasurementBatch in a upload_queue table", e10);
            throw e10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String p() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.s0()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L24
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L36
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L1e
        L1c:
            r2 = move-exception
            goto L27
        L1e:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3c
        L22:
            r0 = move-exception
            goto L3c
        L24:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L27:
            com.google.android.gms.measurement.internal.X2 r3 = r6.f84868a     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.q2 r3 = r3.a()     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.o2 r3 = r3.m()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L1a
        L36:
            if (r0 == 0) goto L3b
            r0.close()
        L3b:
            return r1
        L3c:
            if (r1 == 0) goto L41
            r1.close()
        L41:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11242u.p():java.lang.String");
    }

    public final void p0() {
        h();
        s0().beginTransaction();
    }

    public final void q0() {
        h();
        s0().setTransactionSuccessful();
    }

    public final void r(long j10) {
        f();
        h();
        try {
            if (s0().delete("queue", "rowid=?", new String[]{String.valueOf(j10)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e10) {
            this.f84868a.a().m().b("Failed to delete a bundle in a queue table", e10);
            throw e10;
        }
    }

    public final void r0() {
        h();
        s0().endTransaction();
    }

    final void s() {
        f();
        h();
        if (Y()) {
            q6 q6Var = this.f85267b;
            long jA = q6Var.J0().f86049e.a();
            X2 x22 = this.f84868a;
            long jC = x22.zzaZ().c();
            long jAbs = Math.abs(jC - jA);
            x22.u();
            if (jAbs > C11187m.p()) {
                q6Var.J0().f86049e.b(jC);
                f();
                h();
                if (Y()) {
                    SQLiteDatabase sQLiteDatabaseS0 = s0();
                    String strValueOf = String.valueOf(x22.zzaZ().a());
                    x22.u();
                    int iDelete = sQLiteDatabaseS0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{strValueOf, String.valueOf(C11187m.o())});
                    if (iDelete > 0) {
                        x22.a().u().b("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }

    final SQLiteDatabase s0() {
        f();
        try {
            return this.f85898d.getWritableDatabase();
        } catch (SQLiteException e10) {
            this.f84868a.a().p().b("Error opening database", e10);
            throw e10;
        }
    }

    final void t(List list) throws SQLException {
        f();
        h();
        com.google.android.gms.common.internal.r.l(list);
        com.google.android.gms.common.internal.r.n(list.size());
        if (!Y()) {
            return;
        }
        String strJoin = TextUtils.join(",", list);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strJoin).length() + 2);
        sb2.append("(");
        sb2.append(strJoin);
        sb2.append(")");
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder(string.length() + 80);
        sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
        sb3.append(string);
        sb3.append(" AND retry_count =  2147483647 LIMIT 1");
        if (n0(sb3.toString(), null) > 0) {
            this.f84868a.a().p().a("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            SQLiteDatabase sQLiteDatabaseS0 = s0();
            StringBuilder sb4 = new StringBuilder(string.length() + com.medallia.digital.mobilesdk.l3.f92485d);
            sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
            sb4.append(string);
            sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
            sQLiteDatabaseS0.execSQL(sb4.toString());
        } catch (SQLiteException e10) {
            this.f84868a.a().m().b("Error incrementing retry count. error", e10);
        }
    }

    final void u(Long l10) {
        f();
        h();
        com.google.android.gms.common.internal.r.l(l10);
        if (!Y()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(l10.toString().length() + 86);
        sb2.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
        sb2.append(l10);
        sb2.append(" AND retry_count =  2147483647 LIMIT 1");
        if (n0(sb2.toString(), null) > 0) {
            this.f84868a.a().p().a("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            SQLiteDatabase sQLiteDatabaseS0 = s0();
            long jA = this.f84868a.zzaZ().a();
            StringBuilder sb3 = new StringBuilder(String.valueOf(jA).length() + 60);
            sb3.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
            sb3.append(jA);
            String string = sb3.toString();
            StringBuilder sb4 = new StringBuilder(string.length() + 34 + l10.toString().length() + 29);
            sb4.append("UPDATE upload_queue");
            sb4.append(string);
            sb4.append(" WHERE rowid = ");
            sb4.append(l10);
            sb4.append(" AND retry_count < 2147483647");
            sQLiteDatabaseS0.execSQL(sb4.toString());
        } catch (SQLiteException e10) {
            this.f84868a.a().m().b("Error incrementing retry count. error", e10);
        }
    }

    final Object v(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            this.f84868a.a().m().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                            return null;
                        }
                        this.f84868a.a().m().a("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(i10);
                }
                return Double.valueOf(cursor.getDouble(i10));
            }
            return Long.valueOf(cursor.getLong(i10));
        }
        this.f84868a.a().m().a("Loaded invalid null value from database");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009a A[Catch: all -> 0x0074, SQLiteException -> 0x00ae, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x001b, B:6:0x0041, B:8:0x0060, B:15:0x0079, B:17:0x009a, B:20:0x00b0, B:23:0x00b8), top: B:29:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0 A[Catch: all -> 0x0074, SQLiteException -> 0x00ae, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x001b, B:6:0x0041, B:8:0x0060, B:15:0x0079, B:17:0x009a, B:20:0x00b0, B:23:0x00b8), top: B:29:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final long x(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            com.google.android.gms.common.internal.r.f(r14)
            java.lang.String r15 = "first_open_count"
            com.google.android.gms.common.internal.r.f(r15)
            r13.f()
            r13.h()
            android.database.sqlite.SQLiteDatabase r0 = r13.s0()
            r0.beginTransaction()
            java.lang.String r1 = " from app2 where app_id=?"
            java.lang.String r2 = "select "
            r3 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r6 = 48
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r5.append(r2)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r5.append(r15)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r5.append(r1)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            java.lang.String[] r2 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r5 = -1
            long r1 = r13.o0(r1, r2, r5)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            java.lang.String r8 = "app2"
            java.lang.String r9 = "app_id"
            if (r7 != 0) goto L79
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r1.<init>()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r1.put(r9, r14)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r1.put(r15, r2)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            java.lang.String r7 = "previous_install_count"
            r1.put(r7, r2)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r2 = 0
            r7 = 5
            long r1 = r0.insertWithOnConflict(r8, r2, r1, r7)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L78
            com.google.android.gms.measurement.internal.X2 r1 = r13.f84868a     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            com.google.android.gms.measurement.internal.q2 r1 = r1.a()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            com.google.android.gms.measurement.internal.o2 r1 = r1.m()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            java.lang.String r2 = "Failed to insert column (got -1). appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C11218q2.v(r14)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r1.c(r2, r7, r15)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            goto Lcc
        L74:
            r14 = move-exception
            goto Ld0
        L76:
            r1 = move-exception
            goto Lb5
        L78:
            r1 = r3
        L79:
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            r7.<init>()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            r7.put(r9, r14)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            r9 = 1
            long r9 = r9 + r1
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            r7.put(r15, r9)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            java.lang.String r9 = "app_id = ?"
            java.lang.String[] r10 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            int r7 = r0.update(r8, r7, r9, r10)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            long r7 = (long) r7     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 != 0) goto Lb0
            com.google.android.gms.measurement.internal.X2 r3 = r13.f84868a     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            com.google.android.gms.measurement.internal.q2 r3 = r3.a()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            com.google.android.gms.measurement.internal.o2 r3 = r3.m()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            java.lang.String r4 = "Failed to update column (got 0). appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C11218q2.v(r14)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            r3.c(r4, r7, r15)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            goto Lcc
        Lae:
            r3 = move-exception
            goto Lb8
        Lb0:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
        Lb3:
            r5 = r1
            goto Lcc
        Lb5:
            r11 = r3
            r3 = r1
            r1 = r11
        Lb8:
            com.google.android.gms.measurement.internal.X2 r4 = r13.f84868a     // Catch: java.lang.Throwable -> L74
            com.google.android.gms.measurement.internal.q2 r4 = r4.a()     // Catch: java.lang.Throwable -> L74
            com.google.android.gms.measurement.internal.o2 r4 = r4.m()     // Catch: java.lang.Throwable -> L74
            java.lang.String r5 = "Error inserting column. appId"
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C11218q2.v(r14)     // Catch: java.lang.Throwable -> L74
            r4.d(r5, r14, r15, r3)     // Catch: java.lang.Throwable -> L74
            goto Lb3
        Lcc:
            r0.endTransaction()
            return r5
        Ld0:
            r0.endTransaction()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11242u.x(java.lang.String, java.lang.String):long");
    }

    public final void x0(String str, String str2) {
        com.google.android.gms.common.internal.r.f(str);
        com.google.android.gms.common.internal.r.f(str2);
        f();
        h();
        try {
            s0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            X2 x22 = this.f84868a;
            x22.a().m().d("Error deleting user property. appId", C11218q2.v(str), x22.B().c(str2), e10);
        }
    }

    public final boolean y0(x6 x6Var) {
        com.google.android.gms.common.internal.r.l(x6Var);
        f();
        h();
        String str = x6Var.f86030a;
        String str2 = x6Var.f86032c;
        if (z0(str, str2) == null) {
            if (z6.p0(str2)) {
                if (n0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= this.f84868a.u().D(str, C11120d2.f85442W, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long jN0 = n0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, x6Var.f86031b});
                this.f84868a.u();
                if (jN0 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", x6Var.f86031b);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(x6Var.f86033d));
        m0(contentValues, "value", x6Var.f86034e);
        try {
            if (s0().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.f84868a.a().m().b("Failed to insert/update user property (got -1). appId", C11218q2.v(str));
                return true;
            }
            return true;
        } catch (SQLiteException e10) {
            this.f84868a.a().m().c("Error storing user property. appId", C11218q2.v(x6Var.f86030a), e10);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.x6 z0(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.r.f(r11)
            com.google.android.gms.common.internal.r.f(r12)
            r10.f()
            r10.h()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.s0()     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L79
            java.lang.String r3 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r4 = "value"
            java.lang.String r5 = "origin"
            java.lang.String[] r4 = new java.lang.String[]{r0, r4, r5}     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L79
            java.lang.String r5 = "app_id=? and name=?"
            java.lang.String[] r6 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L79
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L79
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L70
            if (r0 != 0) goto L32
            goto L99
        L32:
            r0 = 0
            long r7 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L70
            r0 = 1
            java.lang.Object r9 = r10.v(r2, r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L70
            if (r9 != 0) goto L40
            goto L99
        L40:
            r0 = 2
            java.lang.String r5 = r2.getString(r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L70
            com.google.android.gms.measurement.internal.x6 r3 = new com.google.android.gms.measurement.internal.x6     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L70
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            boolean r11 = r2.moveToNext()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            if (r11 == 0) goto L6c
            com.google.android.gms.measurement.internal.X2 r11 = r10.f84868a     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            com.google.android.gms.measurement.internal.q2 r11 = r11.a()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            com.google.android.gms.measurement.internal.o2 r11 = r11.m()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            java.lang.String r12 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C11218q2.v(r4)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            r11.b(r12, r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            goto L6c
        L66:
            r0 = move-exception
            r11 = r0
            goto L74
        L69:
            r0 = move-exception
        L6a:
            r11 = r0
            goto L7e
        L6c:
            r2.close()
            return r3
        L70:
            r0 = move-exception
            r4 = r11
            r6 = r12
            goto L6a
        L74:
            r1 = r2
            goto L9f
        L76:
            r0 = move-exception
            r11 = r0
            goto L9f
        L79:
            r0 = move-exception
            r4 = r11
            r6 = r12
            r11 = r0
            r2 = r1
        L7e:
            com.google.android.gms.measurement.internal.X2 r12 = r10.f84868a     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.measurement.internal.q2 r0 = r12.a()     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.measurement.internal.o2 r0 = r0.m()     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C11218q2.v(r4)     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.measurement.internal.j2 r12 = r12.B()     // Catch: java.lang.Throwable -> L66
            java.lang.String r12 = r12.c(r6)     // Catch: java.lang.Throwable -> L66
            r0.d(r3, r4, r12, r11)     // Catch: java.lang.Throwable -> L66
        L99:
            if (r2 == 0) goto L9e
            r2.close()
        L9e:
            return r1
        L9f:
            if (r1 == 0) goto La4
            r1.close()
        La4:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11242u.z0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.x6");
    }
}
