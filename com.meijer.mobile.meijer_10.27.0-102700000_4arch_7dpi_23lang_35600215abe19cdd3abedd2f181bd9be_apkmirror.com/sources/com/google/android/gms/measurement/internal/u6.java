package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.C10358a3;
import com.google.android.gms.internal.measurement.C10363b;
import com.google.android.gms.internal.measurement.C10403f3;
import com.google.android.gms.internal.measurement.C10421h3;
import com.google.android.gms.internal.measurement.C10493p3;
import com.google.android.gms.internal.measurement.C10497p7;
import com.google.android.gms.internal.measurement.C10502q3;
import com.google.android.gms.internal.measurement.C10510r3;
import com.google.android.gms.internal.measurement.C10554w2;
import com.google.android.gms.internal.measurement.C10580z1;
import com.google.android.gms.internal.measurement.C7;
import com.google.android.gms.internal.measurement.zzmr;
import com.google.maps.android.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes6.dex */
public final class u6 extends AbstractC11108b6 {
    private static final void A(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                x(builder, str3, string, set);
            }
        }
    }

    static int V(com.google.android.gms.internal.measurement.Z2 z22, String str) {
        for (int i10 = 0; i10 < z22.b1(); i10++) {
            if (str.equals(z22.c1(i10).G())) {
                return i10;
            }
        }
        return -1;
    }

    private static final void w(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    final Parcelable L(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
            } catch (SafeParcelReader.ParseException unused) {
                this.f84868a.a().m().a("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC11108b6
    protected final boolean j() {
        return false;
    }

    private static final void B(StringBuilder sb2, int i10, String str, C10403f3 c10403f3) {
        if (c10403f3 == null) {
            return;
        }
        w(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (c10403f3.H() != 0) {
            w(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l10 : c10403f3.G()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (c10403f3.F() != 0) {
            w(sb2, 4);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l11 : c10403f3.E()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (c10403f3.J() != 0) {
            w(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.M2 m22 : c10403f3.I()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(m22.E() ? Integer.valueOf(m22.F()) : null);
                sb2.append(":");
                sb2.append(m22.G() ? Long.valueOf(m22.H()) : null);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (c10403f3.L() != 0) {
            w(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (C10421h3 c10421h3 : c10403f3.K()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                sb2.append(c10421h3.E() ? Integer.valueOf(c10421h3.F()) : null);
                sb2.append(": [");
                Iterator it = c10421h3.G().iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i20 = i19 + 1;
                    if (i19 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i19 = i20;
                }
                sb2.append("]");
                i17 = i18;
            }
            sb2.append("}\n");
        }
        w(sb2, 3);
        sb2.append("}\n");
    }

    private static final void C(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        w(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    private static final void D(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.F1 f12) {
        if (f12 == null) {
            return;
        }
        w(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (f12.E()) {
            int iP = f12.P();
            C(sb2, i10, "comparison_type", iP != 1 ? iP != 2 ? iP != 3 ? iP != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (f12.F()) {
            C(sb2, i10, "match_as_float", Boolean.valueOf(f12.G()));
        }
        if (f12.H()) {
            C(sb2, i10, "comparison_value", f12.I());
        }
        if (f12.J()) {
            C(sb2, i10, "min_comparison_value", f12.K());
        }
        if (f12.L()) {
            C(sb2, i10, "max_comparison_value", f12.M());
        }
        w(sb2, i10);
        sb2.append("}\n");
    }

    static boolean M(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static Bundle[] W(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.S2 s22 = (com.google.android.gms.internal.measurement.S2) it.next();
            if (s22 != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.S2 s23 : s22.O()) {
                    if (s23.G()) {
                        bundle.putString(s23.F(), s23.H());
                    } else if (s23.I()) {
                        bundle.putLong(s23.F(), s23.J());
                    } else if (s23.M()) {
                        bundle.putDouble(s23.F(), s23.N());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    static final Bundle o(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.S2 s22 = (com.google.android.gms.internal.measurement.S2) it.next();
            String strF = s22.F();
            if (s22.M()) {
                bundle.putDouble(strF, s22.N());
            } else if (s22.K()) {
                bundle.putFloat(strF, s22.L());
            } else if (s22.G()) {
                bundle.putString(strF, s22.H());
            } else if (s22.I()) {
                bundle.putLong(strF, s22.J());
            }
        }
        return bundle;
    }

    static final Map q(com.google.android.gms.internal.measurement.O2 o22, String... strArr) {
        Object objZ;
        HashMap map = new HashMap();
        for (com.google.android.gms.internal.measurement.S2 s22 : o22.E()) {
            if (Arrays.asList(strArr).contains(s22.F()) && (objZ = z(s22)) != null) {
                map.put(s22.F(), objZ);
            }
        }
        return map;
    }

    static final Map r(com.google.android.gms.internal.measurement.O2 o22, String str) {
        Object objZ;
        HashMap map = new HashMap();
        for (com.google.android.gms.internal.measurement.S2 s22 : o22.E()) {
            if (s22.F().startsWith("gad_") && (objZ = z(s22)) != null) {
                map.put(s22.F(), objZ);
            }
        }
        return map;
    }

    private final void u(StringBuilder sb2, int i10, List list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.S2 s22 = (com.google.android.gms.internal.measurement.S2) it.next();
            if (s22 != null) {
                w(sb2, i11);
                sb2.append("param {\n");
                C(sb2, i11, "name", s22.E() ? this.f84868a.B().b(s22.F()) : null);
                C(sb2, i11, "string_value", s22.G() ? s22.H() : null);
                C(sb2, i11, "int_value", s22.I() ? Long.valueOf(s22.J()) : null);
                C(sb2, i11, "double_value", s22.M() ? Double.valueOf(s22.N()) : null);
                if (s22.P() > 0) {
                    u(sb2, i11, s22.O());
                }
                w(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    private final void v(StringBuilder sb2, int i10, com.google.android.gms.internal.measurement.B1 b12) {
        String str;
        if (b12 == null) {
            return;
        }
        w(sb2, i10);
        sb2.append("filter {\n");
        if (b12.I()) {
            C(sb2, i10, "complement", Boolean.valueOf(b12.J()));
        }
        if (b12.K()) {
            C(sb2, i10, "param_name", this.f84868a.B().b(b12.L()));
        }
        if (b12.E()) {
            int i11 = i10 + 1;
            com.google.android.gms.internal.measurement.L1 l1F = b12.F();
            if (l1F != null) {
                w(sb2, i11);
                sb2.append("string_filter {\n");
                if (l1F.E()) {
                    switch (l1F.N()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    C(sb2, i11, "match_type", str);
                }
                if (l1F.F()) {
                    C(sb2, i11, "expression", l1F.G());
                }
                if (l1F.H()) {
                    C(sb2, i11, "case_sensitive", Boolean.valueOf(l1F.I()));
                }
                if (l1F.K() > 0) {
                    w(sb2, i10 + 2);
                    sb2.append("expression_list {\n");
                    for (String str2 : l1F.J()) {
                        w(sb2, i10 + 3);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                w(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (b12.G()) {
            D(sb2, i10 + 1, "number_filter", b12.H());
        }
        w(sb2, i10);
        sb2.append("}\n");
    }

    private static final String y(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    @TargetApi(30)
    final S5 G(String str, com.google.android.gms.internal.measurement.Z2 z22, com.google.android.gms.internal.measurement.N2 n22, String str2) {
        int iIndexOf;
        C10497p7.a();
        X2 x22 = this.f84868a;
        if (!x22.u().F(str, C11120d2.f85431Q0)) {
            return null;
        }
        long jA = x22.zzaZ().a();
        Set setA = Od.L.a(x22.u().A(str, C11120d2.f85505v0).split(","));
        q6 q6Var = this.f85267b;
        C11124d6 c11124d6A0 = q6Var.A0();
        String strV = c11124d6A0.f85267b.B0().v(str);
        Uri.Builder builder = new Uri.Builder();
        X2 x23 = c11124d6A0.f84868a;
        builder.scheme(x23.u().A(str, C11120d2.f85491o0));
        if (TextUtils.isEmpty(strV)) {
            builder.authority(x23.u().A(str, C11120d2.f85493p0));
        } else {
            String strA = x23.u().A(str, C11120d2.f85493p0);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strV).length() + 1 + String.valueOf(strA).length());
            sb2.append(strV);
            sb2.append(".");
            sb2.append(strA);
            builder.authority(sb2.toString());
        }
        builder.path(x23.u().A(str, C11120d2.f85495q0));
        x(builder, "gmp_app_id", z22.r0(), setA);
        x22.u().y();
        x(builder, "gmp_version", String.valueOf(133005L), setA);
        String strP = z22.P();
        C11187m c11187mU = x22.u();
        C11112c2 c11112c2 = C11120d2.f85437T0;
        if (c11187mU.F(str, c11112c2) && q6Var.B0().L(str)) {
            strP = "";
        }
        x(builder, "app_instance_id", strP, setA);
        x(builder, "rdid", z22.J(), setA);
        x(builder, "bundle_id", z22.E(), setA);
        String strE = n22.E();
        String strA2 = Od.w.a(strE);
        if (true != TextUtils.isEmpty(strA2)) {
            strE = strA2;
        }
        x(builder, "app_event_name", strE, setA);
        x(builder, "app_version", String.valueOf(z22.x0()), setA);
        String strW = z22.w();
        if (x22.u().F(str, c11112c2) && q6Var.B0().I(str) && !TextUtils.isEmpty(strW) && (iIndexOf = strW.indexOf(".")) != -1) {
            strW = strW.substring(0, iIndexOf);
        }
        x(builder, "os_version", strW, setA);
        x(builder, "timestamp", String.valueOf(n22.H()), setA);
        if (z22.M()) {
            x(builder, "lat", "1", setA);
        }
        x(builder, "privacy_sandbox_version", String.valueOf(z22.d0()), setA);
        x(builder, "trigger_uri_source", "1", setA);
        x(builder, "trigger_uri_timestamp", String.valueOf(jA), setA);
        x(builder, "request_uuid", str2, setA);
        List<com.google.android.gms.internal.measurement.S2> listT = n22.t();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.S2 s22 : listT) {
            String strF = s22.F();
            if (s22.M()) {
                bundle.putString(strF, String.valueOf(s22.N()));
            } else if (s22.K()) {
                bundle.putString(strF, String.valueOf(s22.L()));
            } else if (s22.G()) {
                bundle.putString(strF, s22.H());
            } else if (s22.I()) {
                bundle.putString(strF, String.valueOf(s22.J()));
            }
        }
        A(builder, x22.u().A(str, C11120d2.f85503u0).split("\\|"), bundle, setA);
        List<C10510r3> listA1 = z22.a1();
        Bundle bundle2 = new Bundle();
        for (C10510r3 c10510r3 : listA1) {
            String strG = c10510r3.G();
            if (c10510r3.N()) {
                bundle2.putString(strG, String.valueOf(c10510r3.O()));
            } else if (c10510r3.L()) {
                bundle2.putString(strG, String.valueOf(c10510r3.M()));
            } else if (c10510r3.H()) {
                bundle2.putString(strG, c10510r3.I());
            } else if (c10510r3.J()) {
                bundle2.putString(strG, String.valueOf(c10510r3.K()));
            }
        }
        A(builder, x22.u().A(str, C11120d2.f85501t0).split("\\|"), bundle2, setA);
        x(builder, "dma", true != z22.Y() ? "0" : "1", setA);
        if (!z22.a0().isEmpty()) {
            x(builder, "dma_cps", z22.a0(), setA);
        }
        if (z22.h0()) {
            C10554w2 c10554w2I0 = z22.i0();
            if (!c10554w2I0.P().isEmpty()) {
                x(builder, "dl_gclid", c10554w2I0.P(), setA);
            }
            if (!c10554w2I0.R().isEmpty()) {
                x(builder, "dl_gbraid", c10554w2I0.R(), setA);
            }
            if (!c10554w2I0.T().isEmpty()) {
                x(builder, "dl_gs", c10554w2I0.T(), setA);
            }
            if (c10554w2I0.V() > 0) {
                x(builder, "dl_ss_ts", String.valueOf(c10554w2I0.V()), setA);
            }
            if (!c10554w2I0.X().isEmpty()) {
                x(builder, "mr_gclid", c10554w2I0.X(), setA);
            }
            if (!c10554w2I0.Z().isEmpty()) {
                x(builder, "mr_gbraid", c10554w2I0.Z(), setA);
            }
            if (!c10554w2I0.b0().isEmpty()) {
                x(builder, "mr_gs", c10554w2I0.b0(), setA);
            }
            if (c10554w2I0.d0() > 0) {
                x(builder, "mr_click_ts", String.valueOf(c10554w2I0.d0()), setA);
            }
        }
        return new S5(builder.build().toString(), jA, 1);
    }

    final String I(com.google.android.gms.internal.measurement.Y2 y22) {
        com.google.android.gms.internal.measurement.A2 a2Y0;
        if (y22 == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        if (y22.J()) {
            C(sb2, 0, "upload_subdomain", y22.K());
        }
        if (y22.H()) {
            C(sb2, 0, "sgtm_join_id", y22.I());
        }
        for (C10358a3 c10358a3 : y22.E()) {
            if (c10358a3 != null) {
                w(sb2, 1);
                sb2.append("bundle {\n");
                if (c10358a3.e0()) {
                    C(sb2, 1, "protocol_version", Integer.valueOf(c10358a3.f1()));
                }
                C7.a();
                X2 x22 = this.f84868a;
                if (x22.u().F(c10358a3.E(), C11120d2.f85425N0) && c10358a3.L0()) {
                    C(sb2, 1, "session_stitching_token", c10358a3.M0());
                }
                C(sb2, 1, "platform", c10358a3.A2());
                if (c10358a3.G()) {
                    C(sb2, 1, "gmp_version", Long.valueOf(c10358a3.H()));
                }
                if (c10358a3.I()) {
                    C(sb2, 1, "uploading_gmp_version", Long.valueOf(c10358a3.J()));
                }
                if (c10358a3.H0()) {
                    C(sb2, 1, "dynamite_version", Long.valueOf(c10358a3.I0()));
                }
                if (c10358a3.a0()) {
                    C(sb2, 1, "config_version", Long.valueOf(c10358a3.b0()));
                }
                C(sb2, 1, "gmp_app_id", c10358a3.T());
                C(sb2, 1, "app_id", c10358a3.E());
                C(sb2, 1, "app_version", c10358a3.F());
                if (c10358a3.Y()) {
                    C(sb2, 1, "app_version_major", Integer.valueOf(c10358a3.Z()));
                }
                C(sb2, 1, "firebase_instance_id", c10358a3.X());
                if (c10358a3.O()) {
                    C(sb2, 1, "dev_cert_hash", Long.valueOf(c10358a3.P()));
                }
                C(sb2, 1, "app_store", c10358a3.G2());
                if (c10358a3.q2()) {
                    C(sb2, 1, "upload_timestamp_millis", Long.valueOf(c10358a3.r2()));
                }
                if (c10358a3.s2()) {
                    C(sb2, 1, "start_timestamp_millis", Long.valueOf(c10358a3.t2()));
                }
                if (c10358a3.u2()) {
                    C(sb2, 1, "end_timestamp_millis", Long.valueOf(c10358a3.v2()));
                }
                if (c10358a3.w2()) {
                    C(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c10358a3.x2()));
                }
                if (c10358a3.y2()) {
                    C(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c10358a3.z2()));
                }
                C(sb2, 1, "app_instance_id", c10358a3.N());
                C(sb2, 1, "resettable_device_id", c10358a3.K());
                C(sb2, 1, "ds_id", c10358a3.d0());
                if (c10358a3.L()) {
                    C(sb2, 1, "limited_ad_tracking", Boolean.valueOf(c10358a3.M()));
                }
                C(sb2, 1, "os_version", c10358a3.B2());
                C(sb2, 1, "device_model", c10358a3.C2());
                C(sb2, 1, "user_default_language", c10358a3.D2());
                if (c10358a3.E2()) {
                    C(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(c10358a3.F2()));
                }
                if (c10358a3.Q()) {
                    C(sb2, 1, "bundle_sequential_index", Integer.valueOf(c10358a3.R()));
                }
                if (c10358a3.Z0()) {
                    C(sb2, 1, "delivery_index", Integer.valueOf(c10358a3.a1()));
                }
                if (c10358a3.U()) {
                    C(sb2, 1, "service_upload", Boolean.valueOf(c10358a3.V()));
                }
                C(sb2, 1, "health_monitor", c10358a3.S());
                if (c10358a3.F0()) {
                    C(sb2, 1, "retry_counter", Integer.valueOf(c10358a3.G0()));
                }
                if (c10358a3.J0()) {
                    C(sb2, 1, "consent_signals", c10358a3.K0());
                }
                if (c10358a3.S0()) {
                    C(sb2, 1, "is_dma_region", Boolean.valueOf(c10358a3.T0()));
                }
                if (c10358a3.U0()) {
                    C(sb2, 1, "core_platform_services", c10358a3.V0());
                }
                if (c10358a3.Q0()) {
                    C(sb2, 1, "consent_diagnostics", c10358a3.R0());
                }
                if (c10358a3.N0()) {
                    C(sb2, 1, "target_os_version", Long.valueOf(c10358a3.O0()));
                }
                C10497p7.a();
                if (x22.u().F(c10358a3.E(), C11120d2.f85431Q0)) {
                    C(sb2, 1, "ad_services_version", Integer.valueOf(c10358a3.W0()));
                    if (c10358a3.X0() && (a2Y0 = c10358a3.Y0()) != null) {
                        w(sb2, 2);
                        sb2.append("attribution_eligibility_status {\n");
                        C(sb2, 2, "eligible", Boolean.valueOf(a2Y0.E()));
                        C(sb2, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(a2Y0.F()));
                        C(sb2, 2, "pre_r", Boolean.valueOf(a2Y0.G()));
                        C(sb2, 2, "r_extensions_too_old", Boolean.valueOf(a2Y0.H()));
                        C(sb2, 2, "adservices_extension_too_old", Boolean.valueOf(a2Y0.I()));
                        C(sb2, 2, "ad_storage_not_allowed", Boolean.valueOf(a2Y0.J()));
                        C(sb2, 2, "measurement_manager_disabled", Boolean.valueOf(a2Y0.K()));
                        w(sb2, 2);
                        sb2.append("}\n");
                    }
                }
                if (c10358a3.b1()) {
                    C10554w2 c10554w2C1 = c10358a3.c1();
                    w(sb2, 2);
                    sb2.append("ad_campaign_info {\n");
                    if (c10554w2C1.O()) {
                        C(sb2, 2, "deep_link_gclid", c10554w2C1.P());
                    }
                    if (c10554w2C1.Q()) {
                        C(sb2, 2, "deep_link_gbraid", c10554w2C1.R());
                    }
                    if (c10554w2C1.S()) {
                        C(sb2, 2, "deep_link_gad_source", c10554w2C1.T());
                    }
                    if (c10554w2C1.U()) {
                        C(sb2, 2, "deep_link_session_millis", Long.valueOf(c10554w2C1.V()));
                    }
                    if (c10554w2C1.W()) {
                        C(sb2, 2, "market_referrer_gclid", c10554w2C1.X());
                    }
                    if (c10554w2C1.Y()) {
                        C(sb2, 2, "market_referrer_gbraid", c10554w2C1.Z());
                    }
                    if (c10554w2C1.a0()) {
                        C(sb2, 2, "market_referrer_gad_source", c10554w2C1.b0());
                    }
                    if (c10554w2C1.c0()) {
                        C(sb2, 2, "market_referrer_click_millis", Long.valueOf(c10554w2C1.d0()));
                    }
                    w(sb2, 2);
                    sb2.append("}\n");
                }
                if (c10358a3.f0()) {
                    C(sb2, 1, "batching_timestamp_millis", Long.valueOf(c10358a3.g0()));
                }
                if (c10358a3.d1()) {
                    C10493p3 c10493p3E1 = c10358a3.e1();
                    w(sb2, 2);
                    sb2.append("sgtm_diagnostics {\n");
                    int iJ = c10493p3E1.J();
                    C(sb2, 2, "upload_type", iJ != 1 ? iJ != 2 ? iJ != 3 ? iJ != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    C(sb2, 2, "client_upload_eligibility", c10493p3E1.E().name());
                    int iK = c10493p3E1.K();
                    C(sb2, 2, "service_upload_eligibility", iK != 1 ? iK != 2 ? iK != 3 ? iK != 4 ? iK != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    w(sb2, 2);
                    sb2.append("}\n");
                }
                if (c10358a3.h0()) {
                    com.google.android.gms.internal.measurement.K2 k2I0 = c10358a3.i0();
                    w(sb2, 2);
                    sb2.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.H2 h22 : k2I0.E()) {
                        w(sb2, 3);
                        sb2.append("limited_data_modes {\n");
                        int iG = h22.G();
                        C(sb2, 3, "type", iG != 1 ? iG != 2 ? iG != 3 ? iG != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int iH = h22.H();
                        C(sb2, 3, "mode", iH != 1 ? iH != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        w(sb2, 3);
                        sb2.append("}\n");
                    }
                    w(sb2, 2);
                    sb2.append("}\n");
                }
                List<C10510r3> listN2 = c10358a3.n2();
                if (listN2 != null) {
                    for (C10510r3 c10510r3 : listN2) {
                        if (c10510r3 != null) {
                            w(sb2, 2);
                            sb2.append("user_property {\n");
                            C(sb2, 2, "set_timestamp_millis", c10510r3.E() ? Long.valueOf(c10510r3.F()) : null);
                            C(sb2, 2, "name", x22.B().c(c10510r3.G()));
                            C(sb2, 2, "string_value", c10510r3.I());
                            C(sb2, 2, "int_value", c10510r3.J() ? Long.valueOf(c10510r3.K()) : null);
                            C(sb2, 2, "double_value", c10510r3.N() ? Double.valueOf(c10510r3.O()) : null);
                            w(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.C2> listW = c10358a3.W();
                if (listW != null) {
                    for (com.google.android.gms.internal.measurement.C2 c22 : listW) {
                        if (c22 != null) {
                            w(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (c22.E()) {
                                C(sb2, 2, "audience_id", Integer.valueOf(c22.F()));
                            }
                            if (c22.J()) {
                                C(sb2, 2, "new_audience", Boolean.valueOf(c22.K()));
                            }
                            B(sb2, 2, "current_data", c22.G());
                            if (c22.H()) {
                                B(sb2, 2, "previous_data", c22.I());
                            }
                            w(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.O2> listH2 = c10358a3.h2();
                if (listH2 != null) {
                    for (com.google.android.gms.internal.measurement.O2 o22 : listH2) {
                        if (o22 != null) {
                            w(sb2, 2);
                            sb2.append("event {\n");
                            C(sb2, 2, "name", x22.B().a(o22.H()));
                            if (o22.I()) {
                                C(sb2, 2, "timestamp_millis", Long.valueOf(o22.J()));
                            }
                            if (o22.K()) {
                                C(sb2, 2, "previous_timestamp_millis", Long.valueOf(o22.L()));
                            }
                            if (o22.M()) {
                                C(sb2, 2, "count", Integer.valueOf(o22.N()));
                            }
                            if (o22.F() != 0) {
                                u(sb2, 2, o22.E());
                            }
                            w(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                w(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("} // End-of-batch\n");
        return sb2.toString();
    }

    final String J(C10580z1 c10580z1) {
        if (c10580z1 == null) {
            return BuildConfig.TRAVIS;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (c10580z1.E()) {
            C(sb2, 0, "filter_id", Integer.valueOf(c10580z1.F()));
        }
        C(sb2, 0, "event_name", this.f84868a.B().a(c10580z1.G()));
        String strY = y(c10580z1.M(), c10580z1.N(), c10580z1.P());
        if (!strY.isEmpty()) {
            C(sb2, 0, "filter_type", strY);
        }
        if (c10580z1.K()) {
            D(sb2, 1, "event_count_filter", c10580z1.L());
        }
        if (c10580z1.I() > 0) {
            sb2.append("  filters {\n");
            Iterator it = c10580z1.H().iterator();
            while (it.hasNext()) {
                v(sb2, 2, (com.google.android.gms.internal.measurement.B1) it.next());
            }
        }
        w(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    final String K(com.google.android.gms.internal.measurement.H1 h12) {
        if (h12 == null) {
            return BuildConfig.TRAVIS;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (h12.E()) {
            C(sb2, 0, "filter_id", Integer.valueOf(h12.F()));
        }
        C(sb2, 0, "property_name", this.f84868a.B().c(h12.G()));
        String strY = y(h12.I(), h12.J(), h12.L());
        if (!strY.isEmpty()) {
            C(sb2, 0, "filter_type", strY);
        }
        v(sb2, 1, h12.H());
        sb2.append("}\n");
        return sb2.toString();
    }

    final List P(List list, List list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f84868a.a().p().b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    this.f84868a.a().p().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    final boolean Q(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(this.f84868a.zzaZ().a() - j10) > j11;
    }

    final byte[] T(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            this.f84868a.a().m().b("Failed to gzip content", e10);
            throw e10;
        }
    }

    final Map X(Bundle bundle, boolean z10) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z11 = obj instanceof Parcelable[];
            if (z11 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    if (z11) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(X((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            Object obj2 = arrayList2.get(i10);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(X((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(X((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    final Bundle l(Map map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(l((Map) arrayList.get(i10), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    u6(q6 q6Var) {
        super(q6Var);
    }

    static boolean N(List list, int i10) {
        if (i10 < list.size() * 64) {
            if (((1 << (i10 % 64)) & ((Long) list.get(i10 / 64)).longValue()) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    static List O(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    static com.google.android.gms.internal.measurement.J5 U(com.google.android.gms.internal.measurement.J5 j52, byte[] bArr) throws zzmr {
        com.google.android.gms.internal.measurement.P4 p4A = com.google.android.gms.internal.measurement.P4.a();
        if (p4A != null) {
            return j52.O2(bArr, p4A);
        }
        return j52.g1(bArr);
    }

    static final void m(com.google.android.gms.internal.measurement.N2 n22, String str, Object obj) {
        List listT = n22.t();
        int i10 = 0;
        while (true) {
            if (i10 < listT.size()) {
                if (str.equals(((com.google.android.gms.internal.measurement.S2) listT.get(i10)).F())) {
                    break;
                } else {
                    i10++;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        com.google.android.gms.internal.measurement.R2 r2Q = com.google.android.gms.internal.measurement.S2.Q();
        r2Q.u(str);
        r2Q.y(((Long) obj).longValue());
        if (i10 >= 0) {
            n22.x(i10, r2Q);
        } else {
            n22.z(r2Q);
        }
    }

    static final boolean n(G g10, B6 b62) {
        com.google.android.gms.common.internal.r.l(g10);
        com.google.android.gms.common.internal.r.l(b62);
        if (TextUtils.isEmpty(b62.f84904b)) {
            return false;
        }
        return true;
    }

    static final com.google.android.gms.internal.measurement.S2 p(com.google.android.gms.internal.measurement.O2 o22, String str) {
        for (com.google.android.gms.internal.measurement.S2 s22 : o22.E()) {
            if (s22.F().equals(str)) {
                return s22;
            }
        }
        return null;
    }

    static final Object s(com.google.android.gms.internal.measurement.O2 o22, String str) {
        com.google.android.gms.internal.measurement.S2 s2P = p(o22, str);
        if (s2P == null) {
            return null;
        }
        return z(s2P);
    }

    static final Object t(com.google.android.gms.internal.measurement.O2 o22, String str, Object obj) {
        Object objS = s(o22, str);
        if (objS == null) {
            return obj;
        }
        return objS;
    }

    private static final void x(Uri.Builder builder, String str, String str2, Set set) {
        if (!set.contains(str) && !TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }

    private static final Object z(com.google.android.gms.internal.measurement.S2 s22) {
        if (s22.G()) {
            return s22.H();
        }
        if (s22.I()) {
            return Long.valueOf(s22.J());
        }
        if (s22.M()) {
            return Double.valueOf(s22.N());
        }
        if (s22.P() > 0) {
            return W(s22.O());
        }
        return null;
    }

    final void E(C10502q3 c10502q3, Object obj) {
        com.google.android.gms.common.internal.r.l(obj);
        c10502q3.w();
        c10502q3.y();
        c10502q3.A();
        if (obj instanceof String) {
            c10502q3.v((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c10502q3.x(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            c10502q3.z(((Double) obj).doubleValue());
        } else {
            this.f84868a.a().m().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    final void F(com.google.android.gms.internal.measurement.R2 r22, Object obj) {
        com.google.android.gms.common.internal.r.l(obj);
        r22.x();
        r22.z();
        r22.C();
        r22.G();
        if (obj instanceof String) {
            r22.w((String) obj);
            return;
        }
        if (obj instanceof Long) {
            r22.y(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            r22.A(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    com.google.android.gms.internal.measurement.R2 r2Q = com.google.android.gms.internal.measurement.S2.Q();
                    for (String str : bundle.keySet()) {
                        com.google.android.gms.internal.measurement.R2 r2Q2 = com.google.android.gms.internal.measurement.S2.Q();
                        r2Q2.u(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            r2Q2.y(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            r2Q2.w((String) obj2);
                        } else if (obj2 instanceof Double) {
                            r2Q2.A(((Double) obj2).doubleValue());
                        }
                        r2Q.E(r2Q2);
                    }
                    if (r2Q.D() > 0) {
                        arrayList.add((com.google.android.gms.internal.measurement.S2) r2Q.q());
                    }
                }
            }
            r22.F(arrayList);
            return;
        }
        this.f84868a.a().m().b("Ignoring invalid (type) event param value", obj);
    }

    final com.google.android.gms.internal.measurement.O2 H(B b10) {
        com.google.android.gms.internal.measurement.N2 n2O = com.google.android.gms.internal.measurement.O2.O();
        n2O.K(b10.f84886e);
        E e10 = b10.f84887f;
        D d10 = new D(e10);
        while (d10.hasNext()) {
            String next = d10.next();
            com.google.android.gms.internal.measurement.R2 r2Q = com.google.android.gms.internal.measurement.S2.Q();
            r2Q.u(next);
            Object objB = e10.B(next);
            com.google.android.gms.common.internal.r.l(objB);
            F(r2Q, objB);
            n2O.z(r2Q);
        }
        String str = b10.f84884c;
        if (!TextUtils.isEmpty(str) && e10.B("_o") == null) {
            com.google.android.gms.internal.measurement.R2 r2Q2 = com.google.android.gms.internal.measurement.S2.Q();
            r2Q2.u("_o");
            r2Q2.w(str);
            n2O.y((com.google.android.gms.internal.measurement.S2) r2Q2.q());
        }
        return (com.google.android.gms.internal.measurement.O2) n2O.q();
    }

    final long R(byte[] bArr) throws NoSuchAlgorithmException {
        com.google.android.gms.common.internal.r.l(bArr);
        X2 x22 = this.f84868a;
        x22.A().f();
        MessageDigest messageDigestA = z6.A();
        if (messageDigestA == null) {
            x22.a().m().a("Failed to get MD5");
            return 0L;
        }
        return z6.B(messageDigestA.digest(bArr));
    }

    final long S(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return R(str.getBytes(Charset.forName("UTF-8")));
    }

    final G k(C10363b c10363b) {
        String string;
        Object obj;
        Bundle bundleL = l(c10363b.f(), true);
        if (bundleL.containsKey("_o") && (obj = bundleL.get("_o")) != null) {
            string = obj.toString();
        } else {
            string = "app";
        }
        String str = string;
        String strB = Od.w.b(c10363b.b());
        if (strB == null) {
            strB = c10363b.b();
        }
        return new G(strB, new E(bundleL), str, c10363b.a());
    }
}
