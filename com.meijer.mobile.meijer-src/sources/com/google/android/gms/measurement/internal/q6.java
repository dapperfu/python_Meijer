package com.google.android.gms.measurement.internal;

import Z.C5603a;
import android.app.BroadcastOptions;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC10525f0;
import com.google.android.gms.internal.measurement.C10536g2;
import com.google.android.gms.internal.measurement.C10622p7;
import com.google.android.gms.internal.measurement.C10627q3;
import com.google.android.gms.internal.measurement.C10635r3;
import com.google.android.gms.internal.measurement.C10643s2;
import com.google.android.gms.internal.measurement.C10679w2;
import com.google.android.gms.internal.measurement.EnumC10573k3;
import com.google.android.gms.internal.measurement.N6;
import com.google.android.gms.internal.measurement.zzmr;
import com.medallia.digital.mobilesdk.l8;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.core.source.CameraSettings;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import qd.C16631b;
import sd.C17067f;

/* loaded from: classes6.dex */
public final class q6 implements C3 {

    /* renamed from: K, reason: collision with root package name */
    private static volatile q6 f86624K;

    /* renamed from: A, reason: collision with root package name */
    private long f86625A;

    /* renamed from: B, reason: collision with root package name */
    private final Map f86626B;

    /* renamed from: C, reason: collision with root package name */
    private final Map f86627C;

    /* renamed from: D, reason: collision with root package name */
    private final Map f86628D;

    /* renamed from: F, reason: collision with root package name */
    private E4 f86630F;

    /* renamed from: G, reason: collision with root package name */
    private String f86631G;

    /* renamed from: H, reason: collision with root package name */
    private AbstractC11388x f86632H;

    /* renamed from: I, reason: collision with root package name */
    private long f86633I;

    /* renamed from: a, reason: collision with root package name */
    private final P2 f86635a;

    /* renamed from: b, reason: collision with root package name */
    private final C11377v2 f86636b;

    /* renamed from: c, reason: collision with root package name */
    private C11367u f86637c;

    /* renamed from: d, reason: collision with root package name */
    private C11398y2 f86638d;

    /* renamed from: e, reason: collision with root package name */
    private V5 f86639e;

    /* renamed from: f, reason: collision with root package name */
    private C11250e f86640f;

    /* renamed from: g, reason: collision with root package name */
    private final u6 f86641g;

    /* renamed from: h, reason: collision with root package name */
    private C4 f86642h;

    /* renamed from: i, reason: collision with root package name */
    private C11401y5 f86643i;

    /* renamed from: j, reason: collision with root package name */
    private final C11249d6 f86644j;

    /* renamed from: k, reason: collision with root package name */
    private H2 f86645k;

    /* renamed from: l, reason: collision with root package name */
    private final X2 f86646l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f86648n;

    /* renamed from: o, reason: collision with root package name */
    long f86649o;

    /* renamed from: p, reason: collision with root package name */
    private List f86650p;

    /* renamed from: r, reason: collision with root package name */
    private int f86652r;

    /* renamed from: s, reason: collision with root package name */
    private int f86653s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f86654t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f86655u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f86656v;

    /* renamed from: w, reason: collision with root package name */
    private FileLock f86657w;

    /* renamed from: x, reason: collision with root package name */
    private FileChannel f86658x;

    /* renamed from: y, reason: collision with root package name */
    private List f86659y;

    /* renamed from: z, reason: collision with root package name */
    private List f86660z;

    /* renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f86647m = new AtomicBoolean(false);

    /* renamed from: q, reason: collision with root package name */
    private final Deque f86651q = new LinkedList();

    /* renamed from: E, reason: collision with root package name */
    private final Map f86629E = new HashMap();

    /* renamed from: J, reason: collision with root package name */
    private final y6 f86634J = new l6(this);

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private final boolean K(java.lang.String r44, long r45) {
        /*
            Method dump skipped, instructions count: 3599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q6.K(java.lang.String, long):boolean");
    }

    private final void L(com.google.android.gms.internal.measurement.Z2 z22, long j10, boolean z10) {
        Object obj;
        String str = true != z10 ? "_lte" : "_se";
        x6 x6VarZ0 = D0().z0(z22.E(), str);
        x6 x6Var = (x6VarZ0 == null || (obj = x6VarZ0.f86874e) == null) ? new x6(z22.E(), CameraSettings.FOCUS_STRATEGY_AUTO, str, zzaZ().a(), Long.valueOf(j10)) : new x6(z22.E(), CameraSettings.FOCUS_STRATEGY_AUTO, str, zzaZ().a(), Long.valueOf(((Long) obj).longValue() + j10));
        C10627q3 c10627q3P = C10635r3.P();
        c10627q3P.u(str);
        c10627q3P.t(zzaZ().a());
        Object obj2 = x6Var.f86874e;
        c10627q3P.x(((Long) obj2).longValue());
        C10635r3 c10635r3 = (C10635r3) c10627q3P.q();
        int iV = u6.V(z22, str);
        if (iV >= 0) {
            z22.e1(iV, c10635r3);
        } else {
            z22.f1(c10635r3);
        }
        if (j10 > 0) {
            D0().y0(x6Var);
            a().u().c("Updated engagement user property. scope, value", true != z10 ? "lifetime" : "session-scoped", obj2);
        }
    }

    public final C11249d6 A0() {
        return this.f86644j;
    }

    public final C11401y5 J0() {
        return this.f86643i;
    }

    final void c0() {
        this.f86652r++;
    }

    final void d0() {
        this.f86653s++;
    }

    final X2 e0() {
        return this.f86646l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0366 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:89:0x02f2, B:98:0x0325, B:100:0x0366, B:102:0x036b, B:103:0x0382, B:105:0x038d, B:107:0x03a6, B:109:0x03ab, B:110:0x03c2, B:113:0x03e4, B:117:0x0407, B:118:0x041e, B:120:0x042a, B:123:0x0447, B:124:0x045b, B:126:0x0463, B:128:0x046f, B:130:0x0475, B:131:0x047c, B:133:0x0489, B:135:0x0491, B:137:0x0499, B:139:0x04a1, B:140:0x04ad, B:141:0x04ba, B:147:0x04fc, B:148:0x0511, B:150:0x0533, B:153:0x054a, B:156:0x0585, B:158:0x05b0, B:160:0x05e8, B:161:0x05eb, B:163:0x05f3, B:164:0x05f6, B:166:0x05fe, B:167:0x0601, B:169:0x0609, B:170:0x060c, B:172:0x0615, B:173:0x0619, B:175:0x0626, B:176:0x0629, B:178:0x0655, B:180:0x065f, B:184:0x0674, B:189:0x0680, B:192:0x0689, B:196:0x0696, B:200:0x06a4, B:204:0x06b2, B:208:0x06c0, B:212:0x06ce, B:216:0x06d9, B:220:0x06e6, B:221:0x06f2, B:223:0x06f8, B:224:0x06fb, B:226:0x071e, B:229:0x0727, B:232:0x0730, B:233:0x074a, B:235:0x0750, B:237:0x0764, B:239:0x0770, B:241:0x077d, B:244:0x0796, B:245:0x07a6, B:249:0x07af, B:250:0x07b2, B:252:0x07bf, B:253:0x07c4, B:255:0x07e2, B:257:0x07e6, B:259:0x07f6, B:261:0x0801, B:262:0x080a, B:264:0x0814, B:266:0x0820, B:268:0x082a, B:270:0x0830, B:272:0x083f, B:274:0x0855, B:276:0x085b, B:277:0x0864, B:279:0x0872, B:281:0x08ae, B:283:0x08b8, B:284:0x08bb, B:286:0x08c5, B:288:0x08e1, B:289:0x08ec, B:291:0x0924, B:293:0x092c, B:295:0x0936, B:296:0x0943, B:298:0x094d, B:299:0x095a, B:300:0x0963, B:302:0x0969, B:304:0x09a5, B:306:0x09af, B:308:0x09c1, B:310:0x09c7, B:311:0x0a0c, B:312:0x0a17, B:313:0x0a22, B:315:0x0a28, B:324:0x0a75, B:325:0x0ac0, B:327:0x0ad1, B:341:0x0b32, B:332:0x0ae9, B:333:0x0aec, B:318:0x0a35, B:320:0x0a61, B:338:0x0b05, B:339:0x0b1c, B:340:0x0b1d, B:227:0x0721, B:157:0x05a2, B:144:0x04e3, B:92:0x0306, B:93:0x030d, B:95:0x0313, B:97:0x031f, B:54:0x0191, B:56:0x019d, B:58:0x01b2, B:64:0x01d2, B:69:0x0208, B:71:0x020e, B:73:0x021c, B:75:0x022a, B:78:0x0236, B:86:0x02bb, B:88:0x02c5, B:80:0x025f, B:81:0x0278, B:85:0x029e, B:84:0x028b, B:67:0x01de, B:68:0x01fc), top: B:353:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018d A[PHI: r28 r29
      0x018d: PHI (r28v6 java.lang.String) = (r28v1 java.lang.String), (r28v1 java.lang.String), (r28v7 java.lang.String) binds: [B:70:0x020c, B:72:0x021a, B:52:0x0189] A[DONT_GENERATE, DONT_INLINE]
      0x018d: PHI (r29v6 java.lang.String) = (r29v1 java.lang.String), (r29v1 java.lang.String), (r29v7 java.lang.String) binds: [B:70:0x020c, B:72:0x021a, B:52:0x0189] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019d A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:89:0x02f2, B:98:0x0325, B:100:0x0366, B:102:0x036b, B:103:0x0382, B:105:0x038d, B:107:0x03a6, B:109:0x03ab, B:110:0x03c2, B:113:0x03e4, B:117:0x0407, B:118:0x041e, B:120:0x042a, B:123:0x0447, B:124:0x045b, B:126:0x0463, B:128:0x046f, B:130:0x0475, B:131:0x047c, B:133:0x0489, B:135:0x0491, B:137:0x0499, B:139:0x04a1, B:140:0x04ad, B:141:0x04ba, B:147:0x04fc, B:148:0x0511, B:150:0x0533, B:153:0x054a, B:156:0x0585, B:158:0x05b0, B:160:0x05e8, B:161:0x05eb, B:163:0x05f3, B:164:0x05f6, B:166:0x05fe, B:167:0x0601, B:169:0x0609, B:170:0x060c, B:172:0x0615, B:173:0x0619, B:175:0x0626, B:176:0x0629, B:178:0x0655, B:180:0x065f, B:184:0x0674, B:189:0x0680, B:192:0x0689, B:196:0x0696, B:200:0x06a4, B:204:0x06b2, B:208:0x06c0, B:212:0x06ce, B:216:0x06d9, B:220:0x06e6, B:221:0x06f2, B:223:0x06f8, B:224:0x06fb, B:226:0x071e, B:229:0x0727, B:232:0x0730, B:233:0x074a, B:235:0x0750, B:237:0x0764, B:239:0x0770, B:241:0x077d, B:244:0x0796, B:245:0x07a6, B:249:0x07af, B:250:0x07b2, B:252:0x07bf, B:253:0x07c4, B:255:0x07e2, B:257:0x07e6, B:259:0x07f6, B:261:0x0801, B:262:0x080a, B:264:0x0814, B:266:0x0820, B:268:0x082a, B:270:0x0830, B:272:0x083f, B:274:0x0855, B:276:0x085b, B:277:0x0864, B:279:0x0872, B:281:0x08ae, B:283:0x08b8, B:284:0x08bb, B:286:0x08c5, B:288:0x08e1, B:289:0x08ec, B:291:0x0924, B:293:0x092c, B:295:0x0936, B:296:0x0943, B:298:0x094d, B:299:0x095a, B:300:0x0963, B:302:0x0969, B:304:0x09a5, B:306:0x09af, B:308:0x09c1, B:310:0x09c7, B:311:0x0a0c, B:312:0x0a17, B:313:0x0a22, B:315:0x0a28, B:324:0x0a75, B:325:0x0ac0, B:327:0x0ad1, B:341:0x0b32, B:332:0x0ae9, B:333:0x0aec, B:318:0x0a35, B:320:0x0a61, B:338:0x0b05, B:339:0x0b1c, B:340:0x0b1d, B:227:0x0721, B:157:0x05a2, B:144:0x04e3, B:92:0x0306, B:93:0x030d, B:95:0x0313, B:97:0x031f, B:54:0x0191, B:56:0x019d, B:58:0x01b2, B:64:0x01d2, B:69:0x0208, B:71:0x020e, B:73:0x021c, B:75:0x022a, B:78:0x0236, B:86:0x02bb, B:88:0x02c5, B:80:0x025f, B:81:0x0278, B:85:0x029e, B:84:0x028b, B:67:0x01de, B:68:0x01fc), top: B:353:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fc A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:89:0x02f2, B:98:0x0325, B:100:0x0366, B:102:0x036b, B:103:0x0382, B:105:0x038d, B:107:0x03a6, B:109:0x03ab, B:110:0x03c2, B:113:0x03e4, B:117:0x0407, B:118:0x041e, B:120:0x042a, B:123:0x0447, B:124:0x045b, B:126:0x0463, B:128:0x046f, B:130:0x0475, B:131:0x047c, B:133:0x0489, B:135:0x0491, B:137:0x0499, B:139:0x04a1, B:140:0x04ad, B:141:0x04ba, B:147:0x04fc, B:148:0x0511, B:150:0x0533, B:153:0x054a, B:156:0x0585, B:158:0x05b0, B:160:0x05e8, B:161:0x05eb, B:163:0x05f3, B:164:0x05f6, B:166:0x05fe, B:167:0x0601, B:169:0x0609, B:170:0x060c, B:172:0x0615, B:173:0x0619, B:175:0x0626, B:176:0x0629, B:178:0x0655, B:180:0x065f, B:184:0x0674, B:189:0x0680, B:192:0x0689, B:196:0x0696, B:200:0x06a4, B:204:0x06b2, B:208:0x06c0, B:212:0x06ce, B:216:0x06d9, B:220:0x06e6, B:221:0x06f2, B:223:0x06f8, B:224:0x06fb, B:226:0x071e, B:229:0x0727, B:232:0x0730, B:233:0x074a, B:235:0x0750, B:237:0x0764, B:239:0x0770, B:241:0x077d, B:244:0x0796, B:245:0x07a6, B:249:0x07af, B:250:0x07b2, B:252:0x07bf, B:253:0x07c4, B:255:0x07e2, B:257:0x07e6, B:259:0x07f6, B:261:0x0801, B:262:0x080a, B:264:0x0814, B:266:0x0820, B:268:0x082a, B:270:0x0830, B:272:0x083f, B:274:0x0855, B:276:0x085b, B:277:0x0864, B:279:0x0872, B:281:0x08ae, B:283:0x08b8, B:284:0x08bb, B:286:0x08c5, B:288:0x08e1, B:289:0x08ec, B:291:0x0924, B:293:0x092c, B:295:0x0936, B:296:0x0943, B:298:0x094d, B:299:0x095a, B:300:0x0963, B:302:0x0969, B:304:0x09a5, B:306:0x09af, B:308:0x09c1, B:310:0x09c7, B:311:0x0a0c, B:312:0x0a17, B:313:0x0a22, B:315:0x0a28, B:324:0x0a75, B:325:0x0ac0, B:327:0x0ad1, B:341:0x0b32, B:332:0x0ae9, B:333:0x0aec, B:318:0x0a35, B:320:0x0a61, B:338:0x0b05, B:339:0x0b1c, B:340:0x0b1d, B:227:0x0721, B:157:0x05a2, B:144:0x04e3, B:92:0x0306, B:93:0x030d, B:95:0x0313, B:97:0x031f, B:54:0x0191, B:56:0x019d, B:58:0x01b2, B:64:0x01d2, B:69:0x0208, B:71:0x020e, B:73:0x021c, B:75:0x022a, B:78:0x0236, B:86:0x02bb, B:88:0x02c5, B:80:0x025f, B:81:0x0278, B:85:0x029e, B:84:0x028b, B:67:0x01de, B:68:0x01fc), top: B:353:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020e A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:89:0x02f2, B:98:0x0325, B:100:0x0366, B:102:0x036b, B:103:0x0382, B:105:0x038d, B:107:0x03a6, B:109:0x03ab, B:110:0x03c2, B:113:0x03e4, B:117:0x0407, B:118:0x041e, B:120:0x042a, B:123:0x0447, B:124:0x045b, B:126:0x0463, B:128:0x046f, B:130:0x0475, B:131:0x047c, B:133:0x0489, B:135:0x0491, B:137:0x0499, B:139:0x04a1, B:140:0x04ad, B:141:0x04ba, B:147:0x04fc, B:148:0x0511, B:150:0x0533, B:153:0x054a, B:156:0x0585, B:158:0x05b0, B:160:0x05e8, B:161:0x05eb, B:163:0x05f3, B:164:0x05f6, B:166:0x05fe, B:167:0x0601, B:169:0x0609, B:170:0x060c, B:172:0x0615, B:173:0x0619, B:175:0x0626, B:176:0x0629, B:178:0x0655, B:180:0x065f, B:184:0x0674, B:189:0x0680, B:192:0x0689, B:196:0x0696, B:200:0x06a4, B:204:0x06b2, B:208:0x06c0, B:212:0x06ce, B:216:0x06d9, B:220:0x06e6, B:221:0x06f2, B:223:0x06f8, B:224:0x06fb, B:226:0x071e, B:229:0x0727, B:232:0x0730, B:233:0x074a, B:235:0x0750, B:237:0x0764, B:239:0x0770, B:241:0x077d, B:244:0x0796, B:245:0x07a6, B:249:0x07af, B:250:0x07b2, B:252:0x07bf, B:253:0x07c4, B:255:0x07e2, B:257:0x07e6, B:259:0x07f6, B:261:0x0801, B:262:0x080a, B:264:0x0814, B:266:0x0820, B:268:0x082a, B:270:0x0830, B:272:0x083f, B:274:0x0855, B:276:0x085b, B:277:0x0864, B:279:0x0872, B:281:0x08ae, B:283:0x08b8, B:284:0x08bb, B:286:0x08c5, B:288:0x08e1, B:289:0x08ec, B:291:0x0924, B:293:0x092c, B:295:0x0936, B:296:0x0943, B:298:0x094d, B:299:0x095a, B:300:0x0963, B:302:0x0969, B:304:0x09a5, B:306:0x09af, B:308:0x09c1, B:310:0x09c7, B:311:0x0a0c, B:312:0x0a17, B:313:0x0a22, B:315:0x0a28, B:324:0x0a75, B:325:0x0ac0, B:327:0x0ad1, B:341:0x0b32, B:332:0x0ae9, B:333:0x0aec, B:318:0x0a35, B:320:0x0a61, B:338:0x0b05, B:339:0x0b1c, B:340:0x0b1d, B:227:0x0721, B:157:0x05a2, B:144:0x04e3, B:92:0x0306, B:93:0x030d, B:95:0x0313, B:97:0x031f, B:54:0x0191, B:56:0x019d, B:58:0x01b2, B:64:0x01d2, B:69:0x0208, B:71:0x020e, B:73:0x021c, B:75:0x022a, B:78:0x0236, B:86:0x02bb, B:88:0x02c5, B:80:0x025f, B:81:0x0278, B:85:0x029e, B:84:0x028b, B:67:0x01de, B:68:0x01fc), top: B:353:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0306 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:89:0x02f2, B:98:0x0325, B:100:0x0366, B:102:0x036b, B:103:0x0382, B:105:0x038d, B:107:0x03a6, B:109:0x03ab, B:110:0x03c2, B:113:0x03e4, B:117:0x0407, B:118:0x041e, B:120:0x042a, B:123:0x0447, B:124:0x045b, B:126:0x0463, B:128:0x046f, B:130:0x0475, B:131:0x047c, B:133:0x0489, B:135:0x0491, B:137:0x0499, B:139:0x04a1, B:140:0x04ad, B:141:0x04ba, B:147:0x04fc, B:148:0x0511, B:150:0x0533, B:153:0x054a, B:156:0x0585, B:158:0x05b0, B:160:0x05e8, B:161:0x05eb, B:163:0x05f3, B:164:0x05f6, B:166:0x05fe, B:167:0x0601, B:169:0x0609, B:170:0x060c, B:172:0x0615, B:173:0x0619, B:175:0x0626, B:176:0x0629, B:178:0x0655, B:180:0x065f, B:184:0x0674, B:189:0x0680, B:192:0x0689, B:196:0x0696, B:200:0x06a4, B:204:0x06b2, B:208:0x06c0, B:212:0x06ce, B:216:0x06d9, B:220:0x06e6, B:221:0x06f2, B:223:0x06f8, B:224:0x06fb, B:226:0x071e, B:229:0x0727, B:232:0x0730, B:233:0x074a, B:235:0x0750, B:237:0x0764, B:239:0x0770, B:241:0x077d, B:244:0x0796, B:245:0x07a6, B:249:0x07af, B:250:0x07b2, B:252:0x07bf, B:253:0x07c4, B:255:0x07e2, B:257:0x07e6, B:259:0x07f6, B:261:0x0801, B:262:0x080a, B:264:0x0814, B:266:0x0820, B:268:0x082a, B:270:0x0830, B:272:0x083f, B:274:0x0855, B:276:0x085b, B:277:0x0864, B:279:0x0872, B:281:0x08ae, B:283:0x08b8, B:284:0x08bb, B:286:0x08c5, B:288:0x08e1, B:289:0x08ec, B:291:0x0924, B:293:0x092c, B:295:0x0936, B:296:0x0943, B:298:0x094d, B:299:0x095a, B:300:0x0963, B:302:0x0969, B:304:0x09a5, B:306:0x09af, B:308:0x09c1, B:310:0x09c7, B:311:0x0a0c, B:312:0x0a17, B:313:0x0a22, B:315:0x0a28, B:324:0x0a75, B:325:0x0ac0, B:327:0x0ad1, B:341:0x0b32, B:332:0x0ae9, B:333:0x0aec, B:318:0x0a35, B:320:0x0a61, B:338:0x0b05, B:339:0x0b1c, B:340:0x0b1d, B:227:0x0721, B:157:0x05a2, B:144:0x04e3, B:92:0x0306, B:93:0x030d, B:95:0x0313, B:97:0x031f, B:54:0x0191, B:56:0x019d, B:58:0x01b2, B:64:0x01d2, B:69:0x0208, B:71:0x020e, B:73:0x021c, B:75:0x022a, B:78:0x0236, B:86:0x02bb, B:88:0x02c5, B:80:0x025f, B:81:0x0278, B:85:0x029e, B:84:0x028b, B:67:0x01de, B:68:0x01fc), top: B:353:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void k(com.google.android.gms.measurement.internal.G r45, com.google.android.gms.measurement.internal.B6 r46) {
        /*
            Method dump skipped, instructions count: 2923
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q6.k(com.google.android.gms.measurement.internal.G, com.google.android.gms.measurement.internal.B6):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
    
        r22 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x045e A[PHI: r10 r16 r23
      0x045e: PHI (r10v39 java.util.List) = (r10v53 java.util.List), (r10v38 java.util.List) binds: [B:184:0x0484, B:176:0x045c] A[DONT_GENERATE, DONT_INLINE]
      0x045e: PHI (r16v7 java.util.List) = (r16v12 java.util.List), (r16v13 java.util.List) binds: [B:184:0x0484, B:176:0x045c] A[DONT_GENERATE, DONT_INLINE]
      0x045e: PHI (r23v12 android.database.Cursor) = (r23v18 android.database.Cursor), (r23v22 android.database.Cursor) binds: [B:184:0x0484, B:176:0x045c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b A[PHI: r0 r10 r23
      0x006b: PHI (r0v117 java.util.List) = (r0v8 java.util.List), (r0v141 java.util.List) binds: [B:108:0x022a, B:16:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x006b: PHI (r10v57 android.database.Cursor) = (r10v5 android.database.Cursor), (r10v59 android.database.Cursor) binds: [B:108:0x022a, B:16:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x006b: PHI (r23v28 long) = (r23v2 long), (r23v29 long) binds: [B:108:0x022a, B:16:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:473:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:475:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:476:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void q(java.lang.String r33, long r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q6.q(java.lang.String, long):void");
    }

    final /* synthetic */ X2 v0() {
        return this.f86646l;
    }

    final /* synthetic */ Deque w0() {
        return this.f86651q;
    }

    final /* synthetic */ void x0(long j10) {
        this.f86633I = j10;
    }

    private final int G(String str, C11326o c11326o) {
        Qd.v vVar;
        Qd.u uVarK;
        P2 p22 = this.f86635a;
        if (p22.P(str) == null) {
            c11326o.c(Qd.v.AD_PERSONALIZATION, EnumC11319n.FAILSAFE);
            return 1;
        }
        C11384w2 c11384w2H0 = D0().H0(str);
        if (c11384w2H0 != null && C11244d1.c(c11384w2H0.I()).a() == Qd.u.POLICY && (uVarK = p22.k(str, (vVar = Qd.v.AD_PERSONALIZATION))) != Qd.u.UNINITIALIZED) {
            c11326o.c(vVar, EnumC11319n.REMOTE_ENFORCED_DEFAULT);
            return uVarK == Qd.u.GRANTED ? 0 : 1;
        }
        Qd.v vVar2 = Qd.v.AD_PERSONALIZATION;
        c11326o.c(vVar2, EnumC11319n.REMOTE_DEFAULT);
        return p22.N(str, vVar2) ? 0 : 1;
    }

    private final Map H(com.google.android.gms.internal.measurement.O2 o22) {
        HashMap map = new HashMap();
        I0();
        for (Map.Entry entry : u6.r(o22, "gad_").entrySet()) {
            map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map;
    }

    private final AbstractC11388x I() {
        if (this.f86632H == null) {
            this.f86632H = new C11281h6(this, this.f86646l);
        }
        return this.f86632H;
    }

    private static String O(Map map, String str) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    private final void P() {
        long jMax;
        long jMax2;
        b().f();
        M0();
        if (this.f86649o > 0) {
            long jAbs = l8.b.f93365c - Math.abs(zzaZ().c() - this.f86649o);
            if (jAbs > 0) {
                a().u().b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                E0().b();
                F0().l();
                return;
            }
            this.f86649o = 0L;
        }
        if (!this.f86646l.k() || !N()) {
            a().u().a("Nothing to upload or uploading impossible");
            E0().b();
            F0().l();
            return;
        }
        long jA = zzaZ().a();
        z0();
        long jMax3 = Math.max(0L, ((Long) C11245d2.f86268P.b(null)).longValue());
        boolean z10 = true;
        if (!D0().B() && !D0().q()) {
            z10 = false;
        }
        if (z10) {
            String strG = z0().g();
            if (TextUtils.isEmpty(strG) || ".none.".equals(strG)) {
                z0();
                jMax = Math.max(0L, ((Long) C11245d2.f86256J.b(null)).longValue());
            } else {
                z0();
                jMax = Math.max(0L, ((Long) C11245d2.f86258K.b(null)).longValue());
            }
        } else {
            z0();
            jMax = Math.max(0L, ((Long) C11245d2.f86254I.b(null)).longValue());
        }
        long jA2 = this.f86643i.f86892h.a();
        long jA3 = this.f86643i.f86893i.a();
        long j10 = 0;
        boolean z11 = z10;
        long jMax4 = Math.max(D0().w(), D0().y());
        if (jMax4 == 0) {
            jMax2 = 0;
        } else {
            long jAbs2 = jA - Math.abs(jMax4 - jA);
            long jAbs3 = jA - Math.abs(jA2 - jA);
            long jAbs4 = jA - Math.abs(jA3 - jA);
            jMax2 = jMax3 + jAbs2;
            long jMax5 = Math.max(jAbs3, jAbs4);
            if (z11 && jMax5 > 0) {
                jMax2 = Math.min(jAbs2, jMax5) + jMax;
            }
            if (!I0().Q(jMax5, jMax)) {
                jMax2 = jMax5 + jMax;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i10 = 0;
                while (true) {
                    z0();
                    if (i10 >= Math.min(20, Math.max(0, ((Integer) C11245d2.f86272R.b(null)).intValue()))) {
                        jMax2 = 0;
                        break;
                    }
                    z0();
                    jMax2 += Math.max(j10, ((Long) C11245d2.f86270Q.b(null)).longValue()) * (1 << i10);
                    if (jMax2 > jAbs4) {
                        break;
                    }
                    i10++;
                    j10 = 0;
                }
            }
            j10 = 0;
        }
        if (jMax2 == j10) {
            a().u().a("Next upload time is 0");
            E0().b();
            F0().l();
            return;
        }
        if (!C0().k()) {
            a().u().a("No network");
            E0().a();
            F0().l();
            return;
        }
        long jA4 = this.f86643i.f86891g.a();
        z0();
        long jMax6 = Math.max(0L, ((Long) C11245d2.f86250G.b(null)).longValue());
        if (!I0().Q(jA4, jMax6)) {
            jMax2 = Math.max(jMax2, jA4 + jMax6);
        }
        E0().b();
        long jA5 = jMax2 - zzaZ().a();
        if (jA5 <= 0) {
            z0();
            jA5 = Math.max(0L, ((Long) C11245d2.f86260L.b(null)).longValue());
            this.f86643i.f86892h.b(zzaZ().a());
        }
        a().u().b("Upload scheduled in approximately ms", Long.valueOf(jA5));
        F0().k(jA5);
    }

    private final B6 S(String str) {
        C11384w2 c11384w2H0 = D0().H0(str);
        if (c11384w2H0 == null || TextUtils.isEmpty(c11384w2H0.D0())) {
            a().t().b("No app data available; dropping", str);
            return null;
        }
        Boolean boolR = R(c11384w2H0);
        if (boolR == null || boolR.booleanValue()) {
            return new B6(str, c11384w2H0.r0(), c11384w2H0.D0(), c11384w2H0.F0(), c11384w2H0.H0(), c11384w2H0.J0(), c11384w2H0.L0(), (String) null, c11384w2H0.d(), false, c11384w2H0.x0(), 0L, 0, c11384w2H0.P(), false, c11384w2H0.R(), c11384w2H0.b(), c11384w2H0.T(), e(str).l(), "", (String) null, c11384w2H0.V(), c11384w2H0.X(), e(str).b(), P0(str).e(), c11384w2H0.b0(), c11384w2H0.j0(), c11384w2H0.l0(), c11384w2H0.I(), 0L, c11384w2H0.M());
        }
        a().m().b("App version does not match; dropping. appId", C11343q2.v(str));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void U(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    private static final boolean V(B6 b62) {
        return !TextUtils.isEmpty(b62.f85744b);
    }

    private static final AbstractC11233b6 W(AbstractC11233b6 abstractC11233b6) {
        if (abstractC11233b6 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (abstractC11233b6.g()) {
            return abstractC11233b6;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC11233b6.getClass())));
    }

    private static final Boolean X(B6 b62) {
        Boolean bool = b62.f85758p;
        String str = b62.f85740C;
        if (!TextUtils.isEmpty(str)) {
            Qd.u uVarA = C11244d1.c(str).a();
            Qd.u uVar = Qd.u.UNINITIALIZED;
            int iOrdinal = uVarA.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return null;
            }
            if (iOrdinal == 2) {
                return Boolean.TRUE;
            }
            if (iOrdinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    public final P2 B0() {
        P2 p22 = this.f86635a;
        W(p22);
        return p22;
    }

    public final C11377v2 C0() {
        C11377v2 c11377v2 = this.f86636b;
        W(c11377v2);
        return c11377v2;
    }

    public final C11367u D0() {
        C11367u c11367u = this.f86637c;
        W(c11367u);
        return c11367u;
    }

    public final C11398y2 E0() {
        C11398y2 c11398y2 = this.f86638d;
        if (c11398y2 != null) {
            return c11398y2;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final V5 F0() {
        V5 v52 = this.f86639e;
        W(v52);
        return v52;
    }

    public final C11250e G0() {
        C11250e c11250e = this.f86640f;
        W(c11250e);
        return c11250e;
    }

    public final C4 H0() {
        C4 c42 = this.f86642h;
        W(c42);
        return c42;
    }

    public final u6 I0() {
        u6 u6Var = this.f86641g;
        W(u6Var);
        return u6Var;
    }

    public final C11293j2 K0() {
        return this.f86646l.B();
    }

    public final z6 L0() {
        return ((X2) com.google.android.gms.common.internal.r.l(this.f86646l)).A();
    }

    final void M0() {
        if (!this.f86647m.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    final void Z(B6 b62) {
        if (this.f86659y != null) {
            ArrayList arrayList = new ArrayList();
            this.f86660z = arrayList;
            arrayList.addAll(this.f86659y);
        }
        C11367u c11367uD0 = D0();
        String str = (String) com.google.android.gms.common.internal.r.l(b62.f85743a);
        com.google.android.gms.common.internal.r.f(str);
        c11367uD0.f();
        c11367uD0.h();
        try {
            SQLiteDatabase sQLiteDatabaseS0 = c11367uD0.s0();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseS0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseS0.delete("events", "app_id=?", strArr) + sQLiteDatabaseS0.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseS0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseS0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseS0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseS0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseS0.delete("queue", "app_id=?", strArr) + sQLiteDatabaseS0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseS0.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseS0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseS0.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseS0.delete("upload_queue", "app_id=?", strArr);
            N6.a();
            X2 x22 = c11367uD0.f85708a;
            if (x22.u().F(null, C11245d2.f86316i1)) {
                iDelete += sQLiteDatabaseS0.delete("no_data_mode_events", "app_id=?", strArr);
            }
            if (iDelete > 0) {
                x22.a().u().c("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e10) {
            c11367uD0.f85708a.a().m().c("Error resetting analytics data. appId, error", C11343q2.v(str), e10);
        }
        if (b62.f85750h) {
            f0(b62);
        }
    }

    @Override // com.google.android.gms.measurement.internal.C3
    public final C11343q2 a() {
        return ((X2) com.google.android.gms.common.internal.r.l(this.f86646l)).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void a0(com.google.android.gms.measurement.internal.v6 r22, com.google.android.gms.measurement.internal.B6 r23) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q6.a0(com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.B6):void");
    }

    @Override // com.google.android.gms.measurement.internal.C3
    public final T2 b() {
        return ((X2) com.google.android.gms.common.internal.r.l(this.f86646l)).b();
    }

    @Override // com.google.android.gms.measurement.internal.C3
    public final C11258f c() {
        return this.f86646l.c();
    }

    final E3 e(String str) {
        E3 e32 = E3.f85835c;
        b().f();
        M0();
        E3 e3H = (E3) this.f86626B.get(str);
        if (e3H == null) {
            e3H = D0().H(str);
            if (e3H == null) {
                e3H = E3.f85835c;
            }
            d(str, e3H);
        }
        return e3H;
    }

    final void f0(B6 b62) {
        long j10;
        long j11;
        C cT0;
        boolean z10;
        String str;
        PackageInfo packageInfoF;
        ApplicationInfo applicationInfoC;
        long j12;
        boolean z11;
        b().f();
        M0();
        com.google.android.gms.common.internal.r.l(b62);
        String str2 = b62.f85743a;
        com.google.android.gms.common.internal.r.f(str2);
        if (V(b62)) {
            C11384w2 c11384w2H0 = D0().H0(str2);
            if (c11384w2H0 != null && TextUtils.isEmpty(c11384w2H0.r0()) && !TextUtils.isEmpty(b62.f85744b)) {
                c11384w2H0.i(0L);
                D0().I0(c11384w2H0, false, false);
                B0().z(str2);
            }
            if (!b62.f85750h) {
                m0(b62);
                return;
            }
            long jA = b62.f85754l;
            if (jA == 0) {
                jA = zzaZ().a();
            }
            long j13 = jA;
            int i10 = b62.f85755m;
            if (i10 != 0 && i10 != 1) {
                a().p().c("Incorrect app type, assuming installed app. appId, appType", C11343q2.v(str2), Integer.valueOf(i10));
                i10 = 0;
            }
            D0().p0();
            try {
                x6 x6VarZ0 = D0().z0(str2, "_npa");
                Boolean boolX = X(b62);
                if (x6VarZ0 != null && !CameraSettings.FOCUS_STRATEGY_AUTO.equals(x6VarZ0.f86871b)) {
                    j10 = j13;
                    j11 = 1;
                } else if (boolX != null) {
                    v6 v6Var = new v6("_npa", j13, Long.valueOf(true != boolX.booleanValue() ? 0L : 1L), CameraSettings.FOCUS_STRATEGY_AUTO);
                    j11 = 1;
                    j10 = j13;
                    if (x6VarZ0 == null || !x6VarZ0.f86874e.equals(v6Var.f86768d)) {
                        a0(v6Var, b62);
                    }
                } else {
                    j10 = j13;
                    j11 = 1;
                    if (x6VarZ0 != null) {
                        b0("_npa", b62);
                    }
                }
                if (z0().F(null, C11245d2.f86298c1)) {
                    l0(b62, b62.f85741D);
                } else {
                    l0(b62, j10);
                }
                m0(b62);
                if (i10 == 0) {
                    cT0 = D0().t0(str2, "_f");
                    z10 = false;
                } else {
                    cT0 = D0().t0(str2, "_v");
                    z10 = true;
                }
                if (cT0 == null) {
                    long j14 = ((j10 / l8.b.f93365c) + j11) * l8.b.f93365c;
                    if (z10) {
                        long j15 = j10;
                        a0(new v6("_fvt", j15, Long.valueOf(j14), CameraSettings.FOCUS_STRATEGY_AUTO), b62);
                        b().f();
                        M0();
                        Bundle bundle = new Bundle();
                        bundle.putLong("_c", 1L);
                        bundle.putLong("_r", 1L);
                        bundle.putLong("_et", 1L);
                        if (b62.f85757o) {
                            bundle.putLong("_dac", 1L);
                        }
                        if (z0().F(null, C11245d2.f86322k1)) {
                            bundle.putLong("_elt", zzaZ().a());
                        }
                        h(new G("_v", new E(bundle), CameraSettings.FOCUS_STRATEGY_AUTO, j15), b62);
                    } else {
                        Long lValueOf = Long.valueOf(j14);
                        long j16 = j10;
                        a0(new v6("_fot", j16, lValueOf, CameraSettings.FOCUS_STRATEGY_AUTO), b62);
                        b().f();
                        H2 h22 = (H2) com.google.android.gms.common.internal.r.l(this.f86645k);
                        if (str2 == null || str2.isEmpty()) {
                            str = "_elt";
                            h22.f85885a.a().q().a("Install Referrer Reporter was called with invalid app package name");
                        } else {
                            X2 x22 = h22.f85885a;
                            x22.b().f();
                            if (h22.a()) {
                                G2 g22 = new G2(h22, str2);
                                x22.b().f();
                                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                str = "_elt";
                                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                PackageManager packageManager = x22.zzaY().getPackageManager();
                                if (packageManager == null) {
                                    x22.a().q().a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                } else {
                                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                                        x22.a().s().a("Play Service for fetching Install Referrer is unavailable on device");
                                    } else {
                                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                                        if (serviceInfo != null) {
                                            String str3 = serviceInfo.packageName;
                                            if (serviceInfo.name != null && "com.android.vending".equals(str3) && h22.a()) {
                                                try {
                                                    x22.a().u().b("Install Referrer Service is", C16631b.b().a(x22.zzaY(), new Intent(intent), g22, 1) ? "available" : "not available");
                                                } catch (RuntimeException e10) {
                                                    h22.f85885a.a().m().b("Exception occurred while binding to Install Referrer Service", e10.getMessage());
                                                }
                                            } else {
                                                x22.a().p().a("Play Store version 8.3.73 or higher required for Install Referrer");
                                            }
                                        }
                                    }
                                }
                            } else {
                                x22.a().s().a("Install Referrer Reporter is not available");
                                str = "_elt";
                            }
                        }
                        b().f();
                        M0();
                        Bundle bundle2 = new Bundle();
                        long j17 = j11;
                        bundle2.putLong("_c", j17);
                        bundle2.putLong("_r", j17);
                        bundle2.putLong("_uwa", 0L);
                        bundle2.putLong("_pfo", 0L);
                        bundle2.putLong("_sys", 0L);
                        bundle2.putLong("_sysu", 0L);
                        bundle2.putLong("_et", j17);
                        if (b62.f85757o) {
                            bundle2.putLong("_dac", j17);
                        }
                        String str4 = (String) com.google.android.gms.common.internal.r.l(b62.f85743a);
                        C11367u c11367uD0 = D0();
                        com.google.android.gms.common.internal.r.f(str4);
                        c11367uD0.f();
                        c11367uD0.h();
                        long jX = c11367uD0.x(str4, "first_open_count");
                        X2 x23 = this.f86646l;
                        if (x23.zzaY().getPackageManager() == null) {
                            a().m().b("PackageManager is null, first open report might be inaccurate. appId", C11343q2.v(str4));
                        } else {
                            try {
                                packageInfoF = C17067f.a(x23.zzaY()).f(str4, 0);
                            } catch (PackageManager.NameNotFoundException e11) {
                                a().m().c("Package info is null, first open report might be inaccurate. appId", C11343q2.v(str4), e11);
                                packageInfoF = null;
                            }
                            if (packageInfoF != null) {
                                long j18 = packageInfoF.firstInstallTime;
                                if (j18 != 0) {
                                    if (j18 != packageInfoF.lastUpdateTime) {
                                        if (!z0().F(null, C11245d2.f86257J0)) {
                                            bundle2.putLong("_uwa", 1L);
                                        } else if (jX == 0) {
                                            bundle2.putLong("_uwa", 1L);
                                            jX = 0;
                                        }
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    a0(new v6("_fi", j16, Long.valueOf(true != z11 ? 0L : 1L), CameraSettings.FOCUS_STRATEGY_AUTO), b62);
                                }
                            }
                            try {
                                applicationInfoC = C17067f.a(this.f86646l.zzaY()).c(str4, 0);
                            } catch (PackageManager.NameNotFoundException e12) {
                                a().m().c("Application info is null, first open report might be inaccurate. appId", C11343q2.v(str4), e12);
                                applicationInfoC = null;
                            }
                            if (applicationInfoC != null) {
                                if ((applicationInfoC.flags & 1) != 0) {
                                    j12 = 1;
                                    bundle2.putLong("_sys", 1L);
                                } else {
                                    j12 = 1;
                                }
                                if ((applicationInfoC.flags & 128) != 0) {
                                    bundle2.putLong("_sysu", j12);
                                }
                            }
                        }
                        if (jX >= 0) {
                            bundle2.putLong("_pfo", jX);
                        }
                        if (z0().F(null, C11245d2.f86322k1)) {
                            bundle2.putLong(str, zzaZ().a());
                        }
                        h(new G("_f", new E(bundle2), CameraSettings.FOCUS_STRATEGY_AUTO, j16), b62);
                    }
                } else {
                    long j19 = j10;
                    if (b62.f85751i) {
                        h(new G("_cd", new E(new Bundle()), CameraSettings.FOCUS_STRATEGY_AUTO, j19), b62);
                    }
                }
                D0().q0();
                D0().r0();
            } catch (Throwable th2) {
                D0().r0();
                throw th2;
            }
        }
    }

    final void g(G g10, String str) {
        C11384w2 c11384w2H0 = D0().H0(str);
        if (c11384w2H0 == null || TextUtils.isEmpty(c11384w2H0.D0())) {
            a().t().b("No app data available; dropping event", str);
            return;
        }
        Boolean boolR = R(c11384w2H0);
        if (boolR == null) {
            if (!"_ui".equals(g10.f85861a)) {
                a().p().b("Could not find package. appId", C11343q2.v(str));
            }
        } else if (!boolR.booleanValue()) {
            a().m().b("App version does not match; dropping event. appId", C11343q2.v(str));
            return;
        }
        h(g10, new B6(str, c11384w2H0.r0(), c11384w2H0.D0(), c11384w2H0.F0(), c11384w2H0.H0(), c11384w2H0.J0(), c11384w2H0.L0(), (String) null, c11384w2H0.d(), false, c11384w2H0.x0(), 0L, 0, c11384w2H0.P(), false, c11384w2H0.R(), c11384w2H0.b(), c11384w2H0.T(), e(str).l(), "", (String) null, c11384w2H0.V(), c11384w2H0.X(), e(str).b(), P0(str).e(), c11384w2H0.b0(), c11384w2H0.j0(), c11384w2H0.l0(), c11384w2H0.I(), 0L, c11384w2H0.M()));
    }

    final void h(G g10, B6 b62) {
        String str = b62.f85743a;
        com.google.android.gms.common.internal.r.f(str);
        C11349r2 c11349r2A = C11349r2.a(g10);
        L0().u(c11349r2A.f86670d, D0().E(str));
        L0().s(c11349r2A, z0().u(str));
        G gB = c11349r2A.b();
        if (!z0().F(null, C11245d2.f86310g1) && "_cmp".equals(gB.f85861a)) {
            E e10 = gB.f85862b;
            if ("referrer API v2".equals(e10.r0("_cis"))) {
                String strR0 = e10.r0("gclid");
                if (!TextUtils.isEmpty(strR0)) {
                    a0(new v6("_lgclid", gB.f85864d, strR0, CameraSettings.FOCUS_STRATEGY_AUTO), b62);
                }
            }
        }
        i(gB, b62);
    }

    final void h0(C11282i c11282i) {
        B6 b6S = S((String) com.google.android.gms.common.internal.r.l(c11282i.f86448a));
        if (b6S != null) {
            i0(c11282i, b6S);
        }
    }

    final void i(G g10, B6 b62) {
        G g11;
        List<C11282i> listG0;
        List<C11282i> listG02;
        List<C11282i> listG03;
        String str;
        com.google.android.gms.common.internal.r.l(b62);
        String str2 = b62.f85743a;
        com.google.android.gms.common.internal.r.f(str2);
        b().f();
        M0();
        long j10 = g10.f85864d;
        C11349r2 c11349r2A = C11349r2.a(g10);
        b().f();
        z6.i0((this.f86630F == null || (str = this.f86631G) == null || !str.equals(str2)) ? null : this.f86630F, c11349r2A.f86670d, false);
        G gB = c11349r2A.b();
        I0();
        if (u6.n(gB, b62)) {
            if (!b62.f85750h) {
                m0(b62);
                return;
            }
            List list = b62.f85760r;
            if (list != null) {
                String str3 = gB.f85861a;
                if (!list.contains(str3)) {
                    a().t().d("Dropping non-safelisted event. appId, event name, origin", str2, gB.f85861a, gB.f85863c);
                    return;
                } else {
                    Bundle bundleU0 = gB.f85862b.U0();
                    bundleU0.putLong("ga_safelisted", 1L);
                    g11 = new G(str3, new E(bundleU0), gB.f85863c, gB.f85864d);
                }
            } else {
                g11 = gB;
            }
            D0().p0();
            try {
                String str4 = g11.f85861a;
                if ("_s".equals(str4) && !D0().A(str2, "_s") && g11.f85862b.T("_sid").longValue() != 0) {
                    if (D0().A(str2, "_f") || D0().A(str2, "_v")) {
                        D0().G(str2, null, "_sid", j(str2, g11));
                    } else {
                        D0().G(str2, Long.valueOf(zzaZ().a() - 15000), "_sid", j(str2, g11));
                    }
                }
                C11367u c11367uD0 = D0();
                com.google.android.gms.common.internal.r.f(str2);
                c11367uD0.f();
                c11367uD0.h();
                if (j10 < 0) {
                    c11367uD0.f85708a.a().p().c("Invalid time querying timed out conditional properties", C11343q2.v(str2), Long.valueOf(j10));
                    listG0 = Collections.EMPTY_LIST;
                } else {
                    listG0 = c11367uD0.G0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j10)});
                }
                for (C11282i c11282i : listG0) {
                    if (c11282i != null) {
                        a().u().d("User property timed out", c11282i.f86448a, this.f86646l.B().c(c11282i.f86450c.f86766b), c11282i.f86450c.B());
                        G g12 = c11282i.f86454g;
                        if (g12 != null) {
                            k(new G(g12, j10), b62);
                        }
                        D0().E0(str2, c11282i.f86450c.f86766b);
                    }
                }
                C11367u c11367uD02 = D0();
                com.google.android.gms.common.internal.r.f(str2);
                c11367uD02.f();
                c11367uD02.h();
                if (j10 < 0) {
                    c11367uD02.f85708a.a().p().c("Invalid time querying expired conditional properties", C11343q2.v(str2), Long.valueOf(j10));
                    listG02 = Collections.EMPTY_LIST;
                } else {
                    listG02 = c11367uD02.G0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j10)});
                }
                ArrayList arrayList = new ArrayList(listG02.size());
                for (C11282i c11282i2 : listG02) {
                    if (c11282i2 != null) {
                        a().u().d("User property expired", c11282i2.f86448a, this.f86646l.B().c(c11282i2.f86450c.f86766b), c11282i2.f86450c.B());
                        D0().x0(str2, c11282i2.f86450c.f86766b);
                        G g13 = c11282i2.f86458k;
                        if (g13 != null) {
                            arrayList.add(g13);
                        }
                        D0().E0(str2, c11282i2.f86450c.f86766b);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    k(new G((G) it.next(), j10), b62);
                }
                C11367u c11367uD03 = D0();
                com.google.android.gms.common.internal.r.f(str2);
                com.google.android.gms.common.internal.r.f(str4);
                c11367uD03.f();
                c11367uD03.h();
                if (j10 < 0) {
                    X2 x22 = c11367uD03.f85708a;
                    x22.a().p().d("Invalid time querying triggered conditional properties", C11343q2.v(str2), x22.B().a(str4), Long.valueOf(j10));
                    listG03 = Collections.EMPTY_LIST;
                } else {
                    listG03 = c11367uD03.G0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j10)});
                }
                ArrayList arrayList2 = new ArrayList(listG03.size());
                for (C11282i c11282i3 : listG03) {
                    if (c11282i3 != null) {
                        v6 v6Var = c11282i3.f86450c;
                        x6 x6Var = new x6((String) com.google.android.gms.common.internal.r.l(c11282i3.f86448a), c11282i3.f86449b, v6Var.f86766b, j10, com.google.android.gms.common.internal.r.l(v6Var.B()));
                        if (D0().y0(x6Var)) {
                            a().u().d("User property triggered", c11282i3.f86448a, this.f86646l.B().c(x6Var.f86872c), x6Var.f86874e);
                        } else {
                            a().m().d("Too many active user properties, ignoring", C11343q2.v(c11282i3.f86448a), this.f86646l.B().c(x6Var.f86872c), x6Var.f86874e);
                        }
                        G g14 = c11282i3.f86456i;
                        if (g14 != null) {
                            arrayList2.add(g14);
                        }
                        c11282i3.f86450c = new v6(x6Var);
                        c11282i3.f86452e = true;
                        D0().C0(c11282i3);
                    }
                }
                k(g11, b62);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    k(new G((G) it2.next(), j10), b62);
                }
                D0().q0();
                D0().r0();
            } catch (Throwable th2) {
                D0().r0();
                throw th2;
            }
        }
    }

    final Bundle j(String str, G g10) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", g10.f85862b.T("_sid").longValue());
        x6 x6VarZ0 = D0().z0(str, "_sno");
        if (x6VarZ0 != null) {
            Object obj = x6VarZ0.f86874e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    final void j0(C11282i c11282i) {
        B6 b6S = S((String) com.google.android.gms.common.internal.r.l(c11282i.f86448a));
        if (b6S != null) {
            k0(c11282i, b6S);
        }
    }

    final void l0(B6 b62, long j10) {
        C11384w2 c11384w2H0 = D0().H0((String) com.google.android.gms.common.internal.r.l(b62.f85743a));
        if (c11384w2H0 != null && L0().n(b62.f85744b, c11384w2H0.r0())) {
            a().p().b("New GMP App Id passed in. Removing cached database data. appId", C11343q2.v(c11384w2H0.o0()));
            C11367u c11367uD0 = D0();
            String strO0 = c11384w2H0.o0();
            c11367uD0.h();
            c11367uD0.f();
            com.google.android.gms.common.internal.r.f(strO0);
            try {
                SQLiteDatabase sQLiteDatabaseS0 = c11367uD0.s0();
                String[] strArr = {strO0};
                int iDelete = sQLiteDatabaseS0.delete("events", "app_id=?", strArr) + sQLiteDatabaseS0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseS0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseS0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseS0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseS0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseS0.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseS0.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseS0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseS0.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseS0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseS0.delete("trigger_uris", "app_id=?", strArr);
                N6.a();
                X2 x22 = c11367uD0.f85708a;
                if (x22.u().F(null, C11245d2.f86316i1)) {
                    iDelete += sQLiteDatabaseS0.delete("no_data_mode_events", "app_id=?", strArr);
                }
                if (iDelete > 0) {
                    x22.a().u().c("Deleted application data. app, records", strO0, Integer.valueOf(iDelete));
                }
            } catch (SQLiteException e10) {
                c11367uD0.f85708a.a().m().c("Error deleting application data. appId, error", C11343q2.v(strO0), e10);
            }
            c11384w2H0 = null;
        }
        if (c11384w2H0 != null) {
            boolean z10 = (c11384w2H0.F0() == -2147483648L || c11384w2H0.F0() == b62.f85752j) ? false : true;
            String strD0 = c11384w2H0.D0();
            if (z10 || ((c11384w2H0.F0() != -2147483648L || strD0 == null || strD0.equals(b62.f85745c)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", strD0);
                G g10 = new G("_au", new E(bundle), CameraSettings.FOCUS_STRATEGY_AUTO, j10);
                if (z0().F(null, C11245d2.f86301d1)) {
                    h(g10, b62);
                } else {
                    i(g10, b62);
                }
            }
        }
    }

    final String n(E3 e32) {
        if (!e32.o(Qd.v.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        L0().o0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    final List o0(B6 b62, Bundle bundle) {
        b().f();
        C10622p7.a();
        C11312m c11312mZ0 = z0();
        String str = b62.f85743a;
        if (!c11312mZ0.F(str, C11245d2.f86271Q0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    a().m().a("Uri sources and timestamps do not match");
                } else {
                    for (int i10 = 0; i10 < intArray.length; i10++) {
                        C11367u c11367uD0 = D0();
                        int i11 = intArray[i10];
                        long j10 = longArray[i10];
                        com.google.android.gms.common.internal.r.f(str);
                        c11367uD0.f();
                        c11367uD0.h();
                        try {
                            int iDelete = c11367uD0.s0().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i11), String.valueOf(j10)});
                            C11329o2 c11329o2U = c11367uD0.f85708a.a().u();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(iDelete).length() + 46);
                            sb2.append("Pruned ");
                            sb2.append(iDelete);
                            sb2.append(" trigger URIs. appId, source, timestamp");
                            c11329o2U.d(sb2.toString(), str, Integer.valueOf(i11), Long.valueOf(j10));
                        } catch (SQLiteException e10) {
                            c11367uD0.f85708a.a().m().c("Error pruning trigger URIs. appId", C11343q2.v(str), e10);
                        }
                    }
                }
            }
        }
        C11367u c11367uD02 = D0();
        String str2 = b62.f85743a;
        com.google.android.gms.common.internal.r.f(str2);
        c11367uD02.f();
        c11367uD02.h();
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = c11367uD02.s0().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new S5(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e11) {
                c11367uD02.f85708a.a().m().c("Error querying trigger uris. appId", C11343q2.v(str2), e11);
                arrayList = Collections.EMPTY_LIST;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    final void w(com.google.android.gms.internal.measurement.Z2 z22, m6 m6Var) {
        for (int i10 = 0; i10 < z22.R0(); i10++) {
            com.google.android.gms.internal.measurement.N2 n22 = (com.google.android.gms.internal.measurement.N2) z22.S0(i10).q();
            Iterator it = n22.t().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((com.google.android.gms.internal.measurement.S2) it.next()).F())) {
                    if (m6Var.f86533a.W0() >= z0().C(m6Var.f86533a.E(), C11245d2.f86327m0)) {
                        int iC = z0().C(m6Var.f86533a.E(), C11245d2.f86353z0);
                        String strJ0 = null;
                        if (iC <= 0) {
                            if (z0().F(m6Var.f86533a.E(), C11245d2.f86275S0)) {
                                strJ0 = L0().j0();
                                com.google.android.gms.internal.measurement.R2 r2Q = com.google.android.gms.internal.measurement.S2.Q();
                                r2Q.u("_tu");
                                r2Q.w(strJ0);
                                n22.y((com.google.android.gms.internal.measurement.S2) r2Q.q());
                            }
                            com.google.android.gms.internal.measurement.R2 r2Q2 = com.google.android.gms.internal.measurement.S2.Q();
                            r2Q2.u("_tr");
                            r2Q2.y(1L);
                            n22.y((com.google.android.gms.internal.measurement.S2) r2Q2.q());
                            S5 s5G = I0().G(m6Var.f86533a.E(), z22, n22, strJ0);
                            if (s5G != null) {
                                a().u().c("Generated trigger URI. appId, uri", m6Var.f86533a.E(), s5G.f86059a);
                                D0().I(m6Var.f86533a.E(), s5G);
                                Deque deque = this.f86651q;
                                if (!deque.contains(m6Var.f86533a.E())) {
                                    deque.add(m6Var.f86533a.E());
                                }
                            }
                        } else if (D0().J0(f(), m6Var.f86533a.E(), false, false, false, false, false, false, true).f86602g > iC) {
                            com.google.android.gms.internal.measurement.R2 r2Q3 = com.google.android.gms.internal.measurement.S2.Q();
                            r2Q3.u("_tnr");
                            r2Q3.y(1L);
                            n22.y((com.google.android.gms.internal.measurement.S2) r2Q3.q());
                        } else {
                            if (z0().F(m6Var.f86533a.E(), C11245d2.f86275S0)) {
                                strJ0 = L0().j0();
                                com.google.android.gms.internal.measurement.R2 r2Q4 = com.google.android.gms.internal.measurement.S2.Q();
                                r2Q4.u("_tu");
                                r2Q4.w(strJ0);
                                n22.y((com.google.android.gms.internal.measurement.S2) r2Q4.q());
                            }
                            com.google.android.gms.internal.measurement.R2 r2Q5 = com.google.android.gms.internal.measurement.S2.Q();
                            r2Q5.u("_tr");
                            r2Q5.y(1L);
                            n22.y((com.google.android.gms.internal.measurement.S2) r2Q5.q());
                            S5 s5G2 = I0().G(m6Var.f86533a.E(), z22, n22, strJ0);
                            if (s5G2 != null) {
                                a().u().c("Generated trigger URI. appId, uri", m6Var.f86533a.E(), s5G2.f86059a);
                                D0().I(m6Var.f86533a.E(), s5G2);
                                Deque deque2 = this.f86651q;
                                if (!deque2.contains(m6Var.f86533a.E())) {
                                    deque2.add(m6Var.f86533a.E());
                                }
                            }
                        }
                    }
                    z22.T0(i10, (com.google.android.gms.internal.measurement.O2) n22.q());
                }
            }
        }
    }

    final void x(String str, com.google.android.gms.internal.measurement.R2 r22, Bundle bundle, String str2) {
        List listB = com.google.android.gms.common.util.g.b("_o", "_sn", "_sc", "_si");
        long jW = (z6.L(r22.t()) || z6.L(str)) ? z0().w(str2, true) : z0().v(str2, true);
        long jCodePointCount = r22.v().codePointCount(0, r22.v().length());
        z6 z6VarL0 = L0();
        String strT = r22.t();
        z0();
        String strO = z6VarL0.o(strT, 40, true);
        if (jCodePointCount <= jW || listB.contains(r22.t())) {
            return;
        }
        if ("_ev".equals(r22.t())) {
            bundle.putString("_ev", L0().o(r22.v(), z0().w(str2, true), true));
            return;
        }
        a().r().c("Param value is too long; discarded. Name, value length", strO, Long.valueOf(jCodePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strO);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(r22.t());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[Catch: all -> 0x0016, TryCatch #2 {all -> 0x0016, blocks: (B:4:0x0013, B:8:0x001b, B:16:0x0034, B:21:0x0080, B:20:0x0071, B:22:0x008c, B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:73:0x021f, B:75:0x0232, B:77:0x023c, B:85:0x025c, B:79:0x0242, B:81:0x024c, B:83:0x0252, B:84:0x0256, B:86:0x025f, B:87:0x0266, B:30:0x00d7, B:88:0x0267), top: B:95:0x0013, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c A[Catch: all -> 0x0016, PHI: r0
      0x008c: PHI (r0v2 int) = (r0v0 int), (r0v37 int) binds: [B:9:0x0027, B:15:0x0032] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x0016, blocks: (B:4:0x0013, B:8:0x001b, B:16:0x0034, B:21:0x0080, B:20:0x0071, B:22:0x008c, B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:73:0x021f, B:75:0x0232, B:77:0x023c, B:85:0x025c, B:79:0x0242, B:81:0x024c, B:83:0x0252, B:84:0x0256, B:86:0x025f, B:87:0x0266, B:30:0x00d7, B:88:0x0267), top: B:95:0x0013, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #1 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:73:0x021f, B:75:0x0232, B:77:0x023c, B:85:0x025c, B:79:0x0242, B:81:0x024c, B:83:0x0252, B:84:0x0256, B:86:0x025f, B:87:0x0266, B:30:0x00d7), top: B:94:0x00a3, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #1 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:73:0x021f, B:75:0x0232, B:77:0x023c, B:85:0x025c, B:79:0x0242, B:81:0x024c, B:83:0x0252, B:84:0x0256, B:86:0x025f, B:87:0x0266, B:30:0x00d7), top: B:94:0x00a3, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:32:0x00eb, B:33:0x00f4, B:35:0x00fc, B:37:0x0113, B:41:0x013d, B:43:0x0147, B:47:0x0158, B:48:0x015d, B:50:0x0163, B:52:0x017a, B:54:0x019f, B:56:0x01ba, B:58:0x01dd, B:59:0x01ee, B:60:0x01f2, B:62:0x01f8, B:63:0x01ff, B:66:0x020c, B:68:0x0210, B:71:0x0217, B:72:0x0218), top: B:93:0x00eb, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0163 A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:32:0x00eb, B:33:0x00f4, B:35:0x00fc, B:37:0x0113, B:41:0x013d, B:43:0x0147, B:47:0x0158, B:48:0x015d, B:50:0x0163, B:52:0x017a, B:54:0x019f, B:56:0x01ba, B:58:0x01dd, B:59:0x01ee, B:60:0x01f2, B:62:0x01f8, B:63:0x01ff, B:66:0x020c, B:68:0x0210, B:71:0x0217, B:72:0x0218), top: B:93:0x00eb, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ba A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:32:0x00eb, B:33:0x00f4, B:35:0x00fc, B:37:0x0113, B:41:0x013d, B:43:0x0147, B:47:0x0158, B:48:0x015d, B:50:0x0163, B:52:0x017a, B:54:0x019f, B:56:0x01ba, B:58:0x01dd, B:59:0x01ee, B:60:0x01f2, B:62:0x01f8, B:63:0x01ff, B:66:0x020c, B:68:0x0210, B:71:0x0217, B:72:0x0218), top: B:93:0x00eb, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f8 A[Catch: all -> 0x0155, TRY_LEAVE, TryCatch #0 {all -> 0x0155, blocks: (B:32:0x00eb, B:33:0x00f4, B:35:0x00fc, B:37:0x0113, B:41:0x013d, B:43:0x0147, B:47:0x0158, B:48:0x015d, B:50:0x0163, B:52:0x017a, B:54:0x019f, B:56:0x01ba, B:58:0x01dd, B:59:0x01ee, B:60:0x01f2, B:62:0x01f8, B:63:0x01ff, B:66:0x020c, B:68:0x0210, B:71:0x0217, B:72:0x0218), top: B:93:0x00eb, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0242 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #1 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:73:0x021f, B:75:0x0232, B:77:0x023c, B:85:0x025c, B:79:0x0242, B:81:0x024c, B:83:0x0252, B:84:0x0256, B:86:0x025f, B:87:0x0266, B:30:0x00d7), top: B:94:0x00a3, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0256 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #1 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:73:0x021f, B:75:0x0232, B:77:0x023c, B:85:0x025c, B:79:0x0242, B:81:0x024c, B:83:0x0252, B:84:0x0256, B:86:0x025f, B:87:0x0266, B:30:0x00d7), top: B:94:0x00a3, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void y(boolean r19, int r20, java.lang.Throwable r21, byte[] r22, java.lang.String r23, java.util.List r24) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q6.y(boolean, int, java.lang.Throwable, byte[], java.lang.String, java.util.List):void");
    }

    public final C11312m z0() {
        return ((X2) com.google.android.gms.common.internal.r.l(this.f86646l)).u();
    }

    @Override // com.google.android.gms.measurement.internal.C3
    public final Context zzaY() {
        return this.f86646l.zzaY();
    }

    @Override // com.google.android.gms.measurement.internal.C3
    public final com.google.android.gms.common.util.f zzaZ() {
        return ((X2) com.google.android.gms.common.internal.r.l(this.f86646l)).zzaZ();
    }

    q6(r6 r6Var, X2 x22) throws IllegalStateException {
        com.google.android.gms.common.internal.r.l(r6Var);
        this.f86646l = X2.M(r6Var.f86676a, null, null);
        this.f86625A = -1L;
        this.f86644j = new C11249d6(this);
        u6 u6Var = new u6(this);
        u6Var.i();
        this.f86641g = u6Var;
        C11377v2 c11377v2 = new C11377v2(this);
        c11377v2.i();
        this.f86636b = c11377v2;
        P2 p22 = new P2(this);
        p22.i();
        this.f86635a = p22;
        this.f86626B = new HashMap();
        this.f86627C = new HashMap();
        this.f86628D = new HashMap();
        b().r(new RunnableC11257e6(this, r6Var));
    }

    public static q6 D(Context context) {
        com.google.android.gms.common.internal.r.l(context);
        com.google.android.gms.common.internal.r.l(context.getApplicationContext());
        if (f86624K == null) {
            synchronized (q6.class) {
                try {
                    if (f86624K == null) {
                        f86624K = new q6((r6) com.google.android.gms.common.internal.r.l(new r6(context)), null);
                    }
                } finally {
                }
            }
        }
        return f86624K;
    }

    static final void E(com.google.android.gms.internal.measurement.N2 n22, int i10, String str) {
        List listT = n22.t();
        for (int i11 = 0; i11 < listT.size(); i11++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.S2) listT.get(i11)).F())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.R2 r2Q = com.google.android.gms.internal.measurement.S2.Q();
        r2Q.u("_err");
        r2Q.y(i10);
        com.google.android.gms.internal.measurement.S2 s22 = (com.google.android.gms.internal.measurement.S2) r2Q.q();
        com.google.android.gms.internal.measurement.R2 r2Q2 = com.google.android.gms.internal.measurement.S2.Q();
        r2Q2.u("_ev");
        r2Q2.w(str);
        com.google.android.gms.internal.measurement.S2 s23 = (com.google.android.gms.internal.measurement.S2) r2Q2.q();
        n22.y(s22);
        n22.y(s23);
    }

    static final void F(com.google.android.gms.internal.measurement.N2 n22, String str) {
        List listT = n22.t();
        for (int i10 = 0; i10 < listT.size(); i10++) {
            if (str.equals(((com.google.android.gms.internal.measurement.S2) listT.get(i10)).F())) {
                n22.D(i10);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void t0() {
        b().f();
        if (!this.f86651q.isEmpty() && !I().c()) {
            long jMax = Math.max(0L, ((Integer) C11245d2.f86243C0.b(null)).intValue() - (zzaZ().c() - this.f86633I));
            a().u().b("Scheduling notify next app runnable, delay in ms", Long.valueOf(jMax));
            I().b(jMax);
        }
    }

    private final boolean M(com.google.android.gms.internal.measurement.N2 n22, com.google.android.gms.internal.measurement.N2 n23) {
        String strH;
        com.google.android.gms.common.internal.r.a("_e".equals(n22.E()));
        I0();
        com.google.android.gms.internal.measurement.S2 s2P = u6.p((com.google.android.gms.internal.measurement.O2) n22.q(), "_sc");
        String strH2 = null;
        if (s2P == null) {
            strH = null;
        } else {
            strH = s2P.H();
        }
        I0();
        com.google.android.gms.internal.measurement.S2 s2P2 = u6.p((com.google.android.gms.internal.measurement.O2) n23.q(), "_pc");
        if (s2P2 != null) {
            strH2 = s2P2.H();
        }
        if (strH2 != null && strH2.equals(strH)) {
            com.google.android.gms.common.internal.r.a("_e".equals(n22.E()));
            I0();
            com.google.android.gms.internal.measurement.S2 s2P3 = u6.p((com.google.android.gms.internal.measurement.O2) n22.q(), "_et");
            if (s2P3 != null && s2P3.I() && s2P3.J() > 0) {
                long J10 = s2P3.J();
                I0();
                com.google.android.gms.internal.measurement.S2 s2P4 = u6.p((com.google.android.gms.internal.measurement.O2) n23.q(), "_et");
                if (s2P4 != null && s2P4.J() > 0) {
                    J10 += s2P4.J();
                }
                I0();
                u6.m(n23, "_et", Long.valueOf(J10));
                I0();
                u6.m(n22, "_fr", 1L);
                return true;
            }
            return true;
        }
        return false;
    }

    private final boolean N() {
        b().f();
        M0();
        if (!D0().z() && TextUtils.isEmpty(D0().p())) {
            return false;
        }
        return true;
    }

    private final void Q() {
        b().f();
        if (!this.f86654t && !this.f86655u && !this.f86656v) {
            a().u().a("Stopping uploading service(s)");
            List list = this.f86650p;
            if (list == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            ((List) com.google.android.gms.common.internal.r.l(this.f86650p)).clear();
            return;
        }
        a().u().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f86654t), Boolean.valueOf(this.f86655u), Boolean.valueOf(this.f86656v));
    }

    private final Boolean R(C11384w2 c11384w2) {
        try {
            if (c11384w2.F0() != -2147483648L) {
                if (c11384w2.F0() == C17067f.a(this.f86646l.zzaY()).f(c11384w2.o0(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = C17067f.a(this.f86646l.zzaY()).f(c11384w2.o0(), 0).versionName;
                String strD0 = c11384w2.D0();
                if (strD0 != null && strD0.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final boolean T(String str, String str2) {
        C cT0 = D0().t0(str, str2);
        if (cT0 != null && cT0.f85771c >= 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void A(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q6.A(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    final void B(Runnable runnable) {
        b().f();
        if (this.f86650p == null) {
            this.f86650p = new ArrayList();
        }
        this.f86650p.add(runnable);
    }

    final void C() throws IOException {
        b().f();
        M0();
        if (!this.f86648n) {
            this.f86648n = true;
            if (Y()) {
                FileChannel fileChannel = this.f86658x;
                b().f();
                int i10 = 0;
                if (fileChannel != null && fileChannel.isOpen()) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                    try {
                        fileChannel.position(0L);
                        int i11 = fileChannel.read(byteBufferAllocate);
                        if (i11 != 4) {
                            if (i11 != -1) {
                                a().p().b("Unexpected data length. Bytes read", Integer.valueOf(i11));
                            }
                        } else {
                            byteBufferAllocate.flip();
                            i10 = byteBufferAllocate.getInt();
                        }
                    } catch (IOException e10) {
                        a().m().b("Failed to read from channel", e10);
                    }
                } else {
                    a().m().a("Bad channel to read from");
                }
                int iR = this.f86646l.J().r();
                b().f();
                if (i10 > iR) {
                    a().m().c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i10), Integer.valueOf(iR));
                    return;
                }
                if (i10 < iR) {
                    FileChannel fileChannel2 = this.f86658x;
                    b().f();
                    if (fileChannel2 != null && fileChannel2.isOpen()) {
                        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                        byteBufferAllocate2.putInt(iR);
                        byteBufferAllocate2.flip();
                        try {
                            fileChannel2.truncate(0L);
                            fileChannel2.write(byteBufferAllocate2);
                            fileChannel2.force(true);
                            if (fileChannel2.size() != 4) {
                                a().m().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                            }
                            a().u().c("Storage version upgraded. Previous, current version", Integer.valueOf(i10), Integer.valueOf(iR));
                            return;
                        } catch (IOException e11) {
                            a().m().b("Failed to write to channel", e11);
                        }
                    } else {
                        a().m().a("Bad channel to read from");
                    }
                    a().m().c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i10), Integer.valueOf(iR));
                }
            }
        }
    }

    final void N0(B6 b62) {
        b().f();
        M0();
        String str = b62.f85743a;
        com.google.android.gms.common.internal.r.f(str);
        E3 e3F = E3.f(b62.f85761s, b62.f85766x);
        e(str);
        a().u().c("Setting storage consent for package", str, e3F);
        d(str, e3F);
    }

    final void O0(B6 b62) throws NumberFormatException {
        boolean z10;
        b().f();
        M0();
        String str = b62.f85743a;
        com.google.android.gms.common.internal.r.f(str);
        C11395y c11395yG = C11395y.g(b62.f85767y);
        a().u().c("Setting DMA consent for package", str, c11395yG);
        b().f();
        M0();
        Qd.u uVarC = C11395y.h(Q0(str), 100).c();
        this.f86627C.put(str, c11395yG);
        D0().T(str, c11395yG);
        Qd.u uVarC2 = C11395y.h(Q0(str), 100).c();
        b().f();
        M0();
        Qd.u uVar = Qd.u.DENIED;
        boolean z11 = true;
        if (uVarC == uVar && uVarC2 == Qd.u.GRANTED) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (uVarC != Qd.u.GRANTED || uVarC2 != uVar) {
            z11 = false;
        }
        if (!z10 && !z11) {
            return;
        }
        a().u().b("Generated _dcu event for", str);
        Bundle bundle = new Bundle();
        if (D0().J0(f(), str, false, false, false, false, false, false, false).f86601f < z0().C(str, C11245d2.f86329n0)) {
            bundle.putLong("_r", 1L);
            a().u().c("_dcu realtime event count", str, Long.valueOf(D0().J0(f(), str, false, false, false, false, false, true, false).f86601f));
        }
        this.f86634J.X(str, "_dcu", bundle);
    }

    final C11395y P0(String str) {
        b().f();
        M0();
        Map map = this.f86627C;
        C11395y c11395y = (C11395y) map.get(str);
        if (c11395y == null) {
            C11395y c11395yS = D0().S(str);
            map.put(str, c11395yS);
            return c11395yS;
        }
        return c11395y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final Bundle Q0(String str) {
        int iG;
        String str2;
        b().f();
        M0();
        if (B0().P(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        E3 e3E = e(str);
        bundle.putAll(e3E.n());
        bundle.putAll(R0(str, P0(str), e3E, new C11326o()).f());
        x6 x6VarZ0 = D0().z0(str, "_npa");
        if (x6VarZ0 != null) {
            iG = x6VarZ0.f86874e.equals(1L);
        } else {
            iG = G(str, new C11326o());
        }
        if (1 != iG) {
            str2 = "granted";
        } else {
            str2 = "denied";
        }
        bundle.putString("ad_personalization", str2);
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final com.google.android.gms.measurement.internal.C11395y R0(java.lang.String r10, com.google.android.gms.measurement.internal.C11395y r11, com.google.android.gms.measurement.internal.E3 r12, com.google.android.gms.measurement.internal.C11326o r13) {
        /*
            r9 = this;
            com.google.android.gms.measurement.internal.P2 r0 = r9.B0()
            com.google.android.gms.internal.measurement.a2 r0 = r0.P(r10)
            java.lang.String r1 = "-"
            r2 = 90
            if (r0 != 0) goto L31
            Qd.u r10 = r11.c()
            Qd.u r12 = Qd.u.DENIED
            if (r10 != r12) goto L20
            int r2 = r11.b()
            Qd.v r10 = Qd.v.AD_USER_DATA
            r13.b(r10, r2)
            goto L27
        L20:
            Qd.v r10 = Qd.v.AD_USER_DATA
            com.google.android.gms.measurement.internal.n r11 = com.google.android.gms.measurement.internal.EnumC11319n.FAILSAFE
            r13.c(r10, r11)
        L27:
            com.google.android.gms.measurement.internal.y r10 = new com.google.android.gms.measurement.internal.y
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r10.<init>(r11, r2, r12, r1)
            return r10
        L31:
            Qd.u r0 = r11.c()
            Qd.u r3 = Qd.u.GRANTED
            if (r0 == r3) goto L85
            Qd.u r4 = Qd.u.DENIED
            if (r0 != r4) goto L3e
            goto L85
        L3e:
            Qd.u r11 = Qd.u.POLICY
            if (r0 != r11) goto L55
            com.google.android.gms.measurement.internal.P2 r11 = r9.f86635a
            Qd.v r0 = Qd.v.AD_USER_DATA
            Qd.u r11 = r11.k(r10, r0)
            Qd.u r5 = Qd.u.UNINITIALIZED
            if (r11 == r5) goto L55
            com.google.android.gms.measurement.internal.n r12 = com.google.android.gms.measurement.internal.EnumC11319n.REMOTE_ENFORCED_DEFAULT
            r13.c(r0, r12)
            r0 = r11
            goto L8e
        L55:
            com.google.android.gms.measurement.internal.P2 r11 = r9.f86635a
            Qd.v r0 = Qd.v.AD_USER_DATA
            Qd.v r5 = r11.O(r10, r0)
            Qd.u r12 = r12.p()
            r6 = 1
            if (r12 == r3) goto L66
            if (r12 != r4) goto L68
        L66:
            r7 = r6
            goto L69
        L68:
            r7 = 0
        L69:
            Qd.v r8 = Qd.v.AD_STORAGE
            if (r5 != r8) goto L76
            if (r7 == 0) goto L76
            com.google.android.gms.measurement.internal.n r11 = com.google.android.gms.measurement.internal.EnumC11319n.REMOTE_DELEGATION
            r13.c(r0, r11)
            r0 = r12
            goto L8e
        L76:
            com.google.android.gms.measurement.internal.n r12 = com.google.android.gms.measurement.internal.EnumC11319n.REMOTE_DEFAULT
            r13.c(r0, r12)
            boolean r11 = r11.N(r10, r0)
            if (r6 == r11) goto L83
            r0 = r4
            goto L8e
        L83:
            r0 = r3
            goto L8e
        L85:
            int r2 = r11.b()
            Qd.v r11 = Qd.v.AD_USER_DATA
            r13.b(r11, r2)
        L8e:
            com.google.android.gms.measurement.internal.P2 r11 = r9.f86635a
            boolean r11 = r11.Q(r10)
            com.google.android.gms.measurement.internal.P2 r12 = r9.B0()
            java.util.SortedSet r10 = r12.R(r10)
            Qd.u r12 = Qd.u.DENIED
            if (r0 == r12) goto Lbb
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto La7
            goto Lbb
        La7:
            com.google.android.gms.measurement.internal.y r12 = new com.google.android.gms.measurement.internal.y
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            java.lang.String r1 = ""
            if (r11 == 0) goto Lb7
            java.lang.String r1 = android.text.TextUtils.join(r1, r10)
        Lb7:
            r12.<init>(r13, r2, r0, r1)
            return r12
        Lbb:
            com.google.android.gms.measurement.internal.y r10 = new com.google.android.gms.measurement.internal.y
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r10.<init>(r12, r2, r11, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q6.R0(java.lang.String, com.google.android.gms.measurement.internal.y, com.google.android.gms.measurement.internal.E3, com.google.android.gms.measurement.internal.o):com.google.android.gms.measurement.internal.y");
    }

    final boolean Y() throws IOException {
        b().f();
        FileLock fileLock = this.f86657w;
        if (fileLock != null && fileLock.isValid()) {
            a().u().a("Storage concurrent access okay");
            return true;
        }
        this.f86637c.f85708a.u();
        File filesDir = this.f86646l.zzaY().getFilesDir();
        com.google.android.gms.internal.measurement.Z.a();
        int i10 = AbstractC10525f0.f83017b;
        try {
            FileChannel channel = new RandomAccessFile(new File(new File(filesDir, "google_app_measurement.db").getPath()), "rw").getChannel();
            this.f86658x = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.f86657w = fileLockTryLock;
            if (fileLockTryLock != null) {
                a().u().a("Storage concurrent access okay");
                return true;
            }
            a().m().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e10) {
            a().m().b("Failed to acquire storage lock", e10);
            return false;
        } catch (IOException e11) {
            a().m().b("Failed to access storage lock file", e11);
            return false;
        } catch (OverlappingFileLockException e12) {
            a().p().b("Storage lock already acquired", e12);
            return false;
        }
    }

    final void b0(String str, B6 b62) {
        long j10;
        b().f();
        M0();
        if (!V(b62)) {
            return;
        }
        if (!b62.f85750h) {
            m0(b62);
            return;
        }
        Boolean boolX = X(b62);
        if ("_npa".equals(str) && boolX != null) {
            a().t().a("Falling back to manifest metadata value for ad personalization");
            long jA = zzaZ().a();
            if (true != boolX.booleanValue()) {
                j10 = 0;
            } else {
                j10 = 1;
            }
            a0(new v6("_npa", jA, Long.valueOf(j10), CameraSettings.FOCUS_STRATEGY_AUTO), b62);
            return;
        }
        C11329o2 c11329o2T = a().t();
        X2 x22 = this.f86646l;
        c11329o2T.b("Removing user property", x22.B().c(str));
        D0().p0();
        try {
            m0(b62);
            if ("_id".equals(str)) {
                D0().x0((String) com.google.android.gms.common.internal.r.l(b62.f85743a), "_lair");
            }
            D0().x0((String) com.google.android.gms.common.internal.r.l(b62.f85743a), str);
            D0().q0();
            a().t().b("User property removed", x22.B().c(str));
            D0().r0();
        } catch (Throwable th2) {
            D0().r0();
            throw th2;
        }
    }

    final void d(String str, E3 e32) {
        b().f();
        M0();
        this.f86626B.put(str, e32);
        D0().J(str, e32);
    }

    final long f() {
        long jA = zzaZ().a();
        C11401y5 c11401y5 = this.f86643i;
        c11401y5.h();
        c11401y5.f();
        B2 b22 = c11401y5.f86894j;
        long jA2 = b22.a();
        if (jA2 == 0) {
            jA2 = c11401y5.f85708a.A().o0().nextInt(86400000) + 1;
            b22.b(jA2);
        }
        return ((((jA + jA2) / 1000) / 60) / 60) / 24;
    }

    final void g0(B6 b62) throws Throwable {
        b().f();
        M0();
        com.google.android.gms.common.internal.r.l(b62);
        String str = b62.f85743a;
        com.google.android.gms.common.internal.r.f(str);
        int i10 = 0;
        if (z0().F(null, C11245d2.f86239A0)) {
            long jA = zzaZ().a();
            int iC = z0().C(null, C11245d2.f86318j0);
            z0();
            long jL = jA - C11312m.l();
            while (i10 < iC && K(null, jL)) {
                i10++;
            }
        } else {
            z0();
            long jN = C11312m.n();
            while (i10 < jN && K(str, 0L)) {
                i10++;
            }
        }
        if (z0().F(null, C11245d2.f86241B0)) {
            b().f();
            t0();
        }
        if (this.f86644j.h(str, EnumC10573k3.a(b62.f85742E))) {
            a().u().b("[sgtm] Going background, trigger client side upload. appId", str);
            q(str, zzaZ().a());
        }
    }

    final void i0(C11282i c11282i, B6 b62) {
        com.google.android.gms.common.internal.r.l(c11282i);
        com.google.android.gms.common.internal.r.f(c11282i.f86448a);
        com.google.android.gms.common.internal.r.l(c11282i.f86449b);
        com.google.android.gms.common.internal.r.l(c11282i.f86450c);
        com.google.android.gms.common.internal.r.f(c11282i.f86450c.f86766b);
        b().f();
        M0();
        if (!V(b62)) {
            return;
        }
        if (!b62.f85750h) {
            m0(b62);
            return;
        }
        C11282i c11282i2 = new C11282i(c11282i);
        boolean z10 = false;
        c11282i2.f86452e = false;
        D0().p0();
        try {
            C11282i c11282iD0 = D0().D0((String) com.google.android.gms.common.internal.r.l(c11282i2.f86448a), c11282i2.f86450c.f86766b);
            if (c11282iD0 != null && !c11282iD0.f86449b.equals(c11282i2.f86449b)) {
                a().p().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f86646l.B().c(c11282i2.f86450c.f86766b), c11282i2.f86449b, c11282iD0.f86449b);
            }
            if (c11282iD0 != null && c11282iD0.f86452e) {
                c11282i2.f86449b = c11282iD0.f86449b;
                c11282i2.f86451d = c11282iD0.f86451d;
                c11282i2.f86455h = c11282iD0.f86455h;
                c11282i2.f86453f = c11282iD0.f86453f;
                c11282i2.f86456i = c11282iD0.f86456i;
                c11282i2.f86452e = true;
                v6 v6Var = c11282i2.f86450c;
                c11282i2.f86450c = new v6(v6Var.f86766b, c11282iD0.f86450c.f86767c, v6Var.B(), c11282iD0.f86450c.f86770f);
            } else if (TextUtils.isEmpty(c11282i2.f86453f)) {
                v6 v6Var2 = c11282i2.f86450c;
                c11282i2.f86450c = new v6(v6Var2.f86766b, c11282i2.f86451d, v6Var2.B(), c11282i2.f86450c.f86770f);
                c11282i2.f86452e = true;
                z10 = true;
            }
            if (c11282i2.f86452e) {
                v6 v6Var3 = c11282i2.f86450c;
                x6 x6Var = new x6((String) com.google.android.gms.common.internal.r.l(c11282i2.f86448a), c11282i2.f86449b, v6Var3.f86766b, v6Var3.f86767c, com.google.android.gms.common.internal.r.l(v6Var3.B()));
                if (D0().y0(x6Var)) {
                    a().t().d("User property updated immediately", c11282i2.f86448a, this.f86646l.B().c(x6Var.f86872c), x6Var.f86874e);
                } else {
                    a().m().d("(2)Too many active user properties, ignoring", C11343q2.v(c11282i2.f86448a), this.f86646l.B().c(x6Var.f86872c), x6Var.f86874e);
                }
                if (z10 && c11282i2.f86456i != null) {
                    k(new G(c11282i2.f86456i, c11282i2.f86451d), b62);
                }
            }
            if (D0().C0(c11282i2)) {
                a().t().d("Conditional property added", c11282i2.f86448a, this.f86646l.B().c(c11282i2.f86450c.f86766b), c11282i2.f86450c.B());
            } else {
                a().m().d("Too many conditional properties, ignoring", C11343q2.v(c11282i2.f86448a), this.f86646l.B().c(c11282i2.f86450c.f86766b), c11282i2.f86450c.B());
            }
            D0().q0();
            D0().r0();
        } catch (Throwable th2) {
            D0().r0();
            throw th2;
        }
    }

    final void k0(C11282i c11282i, B6 b62) {
        Bundle bundleU0;
        com.google.android.gms.common.internal.r.l(c11282i);
        com.google.android.gms.common.internal.r.f(c11282i.f86448a);
        com.google.android.gms.common.internal.r.l(c11282i.f86450c);
        com.google.android.gms.common.internal.r.f(c11282i.f86450c.f86766b);
        b().f();
        M0();
        if (!V(b62)) {
            return;
        }
        if (!b62.f85750h) {
            m0(b62);
            return;
        }
        D0().p0();
        try {
            m0(b62);
            String str = (String) com.google.android.gms.common.internal.r.l(c11282i.f86448a);
            C11282i c11282iD0 = D0().D0(str, c11282i.f86450c.f86766b);
            if (c11282iD0 != null) {
                a().t().c("Removing conditional user property", c11282i.f86448a, this.f86646l.B().c(c11282i.f86450c.f86766b));
                D0().E0(str, c11282i.f86450c.f86766b);
                if (c11282iD0.f86452e) {
                    D0().x0(str, c11282i.f86450c.f86766b);
                }
                G g10 = c11282i.f86458k;
                if (g10 != null) {
                    E e10 = g10.f85862b;
                    if (e10 != null) {
                        bundleU0 = e10.U0();
                    } else {
                        bundleU0 = null;
                    }
                    k((G) com.google.android.gms.common.internal.r.l(L0().P(str, ((G) com.google.android.gms.common.internal.r.l(g10)).f85861a, bundleU0, c11282iD0.f86449b, g10.f85864d, true, true)), b62);
                }
            } else {
                a().p().c("Conditional user property doesn't exist", C11343q2.v(c11282i.f86448a), this.f86646l.B().c(c11282i.f86450c.f86766b));
            }
            D0().q0();
            D0().r0();
        } catch (Throwable th2) {
            D0().r0();
            throw th2;
        }
    }

    final void l(C11384w2 c11384w2, com.google.android.gms.internal.measurement.Z2 z22) {
        C10635r3 c10635r3;
        b().f();
        M0();
        C11326o c11326oD = C11326o.d(z22.W());
        String strO0 = c11384w2.o0();
        b().f();
        M0();
        E3 e3E = e(strO0);
        Qd.u uVar = Qd.u.UNINITIALIZED;
        int iOrdinal = e3E.p().ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2 && iOrdinal != 3) {
                c11326oD.c(Qd.v.AD_STORAGE, EnumC11319n.FAILSAFE);
            } else {
                c11326oD.b(Qd.v.AD_STORAGE, e3E.b());
            }
        } else {
            c11326oD.c(Qd.v.AD_STORAGE, EnumC11319n.REMOTE_ENFORCED_DEFAULT);
        }
        int iOrdinal2 = e3E.q().ordinal();
        if (iOrdinal2 != 1) {
            if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                c11326oD.c(Qd.v.ANALYTICS_STORAGE, EnumC11319n.FAILSAFE);
            } else {
                c11326oD.b(Qd.v.ANALYTICS_STORAGE, e3E.b());
            }
        } else {
            c11326oD.c(Qd.v.ANALYTICS_STORAGE, EnumC11319n.REMOTE_ENFORCED_DEFAULT);
        }
        String strO02 = c11384w2.o0();
        b().f();
        M0();
        C11395y c11395yR0 = R0(strO02, P0(strO02), e(strO02), c11326oD);
        z22.Z(((Boolean) com.google.android.gms.common.internal.r.l(c11395yR0.j())).booleanValue());
        if (!TextUtils.isEmpty(c11395yR0.k())) {
            z22.c0(c11395yR0.k());
        }
        b().f();
        M0();
        Iterator it = z22.a1().iterator();
        while (true) {
            if (it.hasNext()) {
                c10635r3 = (C10635r3) it.next();
                if ("_npa".equals(c10635r3.G())) {
                    break;
                }
            } else {
                c10635r3 = null;
                break;
            }
        }
        if (c10635r3 != null) {
            Qd.v vVar = Qd.v.AD_PERSONALIZATION;
            if (c11326oD.a(vVar) == EnumC11319n.UNSET) {
                x6 x6VarZ0 = D0().z0(c11384w2.o0(), "_npa");
                if (x6VarZ0 != null) {
                    String str = x6VarZ0.f86871b;
                    if ("tcf".equals(str)) {
                        c11326oD.c(vVar, EnumC11319n.TCF);
                    } else if ("app".equals(str)) {
                        c11326oD.c(vVar, EnumC11319n.API);
                    } else {
                        c11326oD.c(vVar, EnumC11319n.MANIFEST);
                    }
                } else {
                    Boolean boolR = c11384w2.R();
                    if (boolR != null && ((!boolR.booleanValue() || c10635r3.K() == 1) && (boolR.booleanValue() || c10635r3.K() == 0))) {
                        c11326oD.c(vVar, EnumC11319n.MANIFEST);
                    } else {
                        c11326oD.c(vVar, EnumC11319n.API);
                    }
                }
            }
        } else {
            int iG = G(c11384w2.o0(), c11326oD);
            C10627q3 c10627q3P = C10635r3.P();
            c10627q3P.u("_npa");
            c10627q3P.t(zzaZ().a());
            c10627q3P.x(iG);
            z22.f1((C10635r3) c10627q3P.q());
            a().u().c("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(iG));
        }
        z22.X(c11326oD.toString());
        boolean zQ = this.f86635a.Q(c11384w2.o0());
        List listQ0 = z22.Q0();
        int i10 = 0;
        for (int i11 = 0; i11 < listQ0.size(); i11++) {
            if ("_tcf".equals(((com.google.android.gms.internal.measurement.O2) listQ0.get(i11)).H())) {
                com.google.android.gms.internal.measurement.N2 n22 = (com.google.android.gms.internal.measurement.N2) ((com.google.android.gms.internal.measurement.O2) listQ0.get(i11)).q();
                List listT = n22.t();
                int i12 = 0;
                while (true) {
                    if (i12 >= listT.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.S2) listT.get(i12)).F())) {
                        String strH = ((com.google.android.gms.internal.measurement.S2) listT.get(i12)).H();
                        if (zQ && strH.length() > 4) {
                            char[] charArray = strH.toCharArray();
                            int i13 = 1;
                            while (true) {
                                if (i13 >= 64) {
                                    break;
                                }
                                if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i13)) {
                                    i10 = i13;
                                    break;
                                }
                                i13++;
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 | 1);
                            strH = String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.R2 r2Q = com.google.android.gms.internal.measurement.S2.Q();
                        r2Q.u("_tcfd");
                        r2Q.w(strH);
                        n22.x(i12, r2Q);
                    } else {
                        i12++;
                    }
                }
                z22.V0(i11, n22);
                return;
            }
        }
    }

    final void m(C11384w2 c11384w2, com.google.android.gms.internal.measurement.Z2 z22) {
        b().f();
        M0();
        C10643s2 c10643s2E0 = C10679w2.e0();
        byte[] bArrK = c11384w2.K();
        if (bArrK != null) {
            try {
                c10643s2E0 = (C10643s2) u6.U(c10643s2E0, bArrK);
            } catch (zzmr unused) {
                a().p().b("Failed to parse locally stored ad campaign info. appId", C11343q2.v(c11384w2.o0()));
            }
        }
        for (com.google.android.gms.internal.measurement.O2 o22 : z22.Q0()) {
            if (o22.H().equals("_cmp")) {
                String str = (String) u6.t(o22, "gclid", "");
                String str2 = (String) u6.t(o22, "gbraid", "");
                String str3 = (String) u6.t(o22, "gad_source", "");
                String[] strArrSplit = ((String) C11245d2.f86313h1.b(null)).split(",");
                I0();
                if (!u6.q(o22, strArrSplit).isEmpty()) {
                    long jLongValue = ((Long) u6.t(o22, "click_timestamp", 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = o22.J();
                    }
                    if ("referrer API v2".equals(u6.s(o22, "_cis"))) {
                        if (jLongValue > c10643s2E0.I()) {
                            if (str.isEmpty()) {
                                c10643s2E0.D();
                            } else {
                                c10643s2E0.C(str);
                            }
                            if (str2.isEmpty()) {
                                c10643s2E0.F();
                            } else {
                                c10643s2E0.E(str2);
                            }
                            if (str3.isEmpty()) {
                                c10643s2E0.H();
                            } else {
                                c10643s2E0.G(str3);
                            }
                            c10643s2E0.J(jLongValue);
                            c10643s2E0.M();
                            c10643s2E0.N(H(o22));
                        }
                    } else if (jLongValue > c10643s2E0.z()) {
                        if (str.isEmpty()) {
                            c10643s2E0.u();
                        } else {
                            c10643s2E0.t(str);
                        }
                        if (str2.isEmpty()) {
                            c10643s2E0.w();
                        } else {
                            c10643s2E0.v(str2);
                        }
                        if (str3.isEmpty()) {
                            c10643s2E0.y();
                        } else {
                            c10643s2E0.x(str3);
                        }
                        c10643s2E0.A(jLongValue);
                        c10643s2E0.K();
                        c10643s2E0.L(H(o22));
                    }
                }
            }
        }
        if (!((C10679w2) c10643s2E0.q()).equals(C10679w2.f0())) {
            z22.j0((C10679w2) c10643s2E0.q());
        }
        c11384w2.J(((C10679w2) c10643s2E0.q()).g());
        if (c11384w2.A()) {
            D0().I0(c11384w2, false, false);
        }
        if (z0().F(null, C11245d2.f86310g1)) {
            D0().x0(c11384w2.o0(), "_lgclid");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final com.google.android.gms.measurement.internal.C11384w2 m0(com.google.android.gms.measurement.internal.B6 r13) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q6.m0(com.google.android.gms.measurement.internal.B6):com.google.android.gms.measurement.internal.w2");
    }

    final String n0(B6 b62) throws IllegalStateException {
        try {
            return (String) b().p(new CallableC11289i6(this, b62)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            a().m().c("Failed to get app instance id. appId", C11343q2.v(b62.f85743a), e10);
            return null;
        }
    }

    final void o(List list) {
        com.google.android.gms.common.internal.r.a(!list.isEmpty());
        if (this.f86659y != null) {
            a().m().a("Set uploading progress before finishing the previous upload");
        } else {
            this.f86659y = new ArrayList(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.measurement.internal.q6] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    final void p() {
        C11367u c11367uD0;
        long jL;
        SQLiteException e10;
        C11384w2 c11384w2H0;
        b().f();
        M0();
        this.f86656v = true;
        try {
            X2 x22 = this.f86646l;
            x22.c();
            Boolean boolV = x22.H().v();
            if (boolV == null) {
                a().p().a("Upload data called on the client side before use of service was decided");
            } else if (boolV.booleanValue()) {
                a().m().a("Upload called in the client side when service should be used");
            } else if (this.f86649o > 0) {
                P();
            } else {
                b().f();
                if (this.f86659y != null) {
                    a().u().a("Uploading requested multiple times");
                } else if (!C0().k()) {
                    a().u().a("Network not connected, ignoring upload request");
                    P();
                } else {
                    ?? A10 = zzaZ().a();
                    Cursor cursor = null;
                    cursorRawQuery = null;
                    Cursor cursorRawQuery = null;
                    string = null;
                    string = null;
                    String string = null;
                    int iC = z0().C(null, C11245d2.f86318j0);
                    z0();
                    long jL2 = A10 - C11312m.l();
                    for (int i10 = 0; i10 < iC && K(null, jL2); i10++) {
                    }
                    C10622p7.a();
                    b().f();
                    t0();
                    long jA = this.f86643i.f86892h.a();
                    if (jA != 0) {
                        a().t().b("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(A10 - jA)));
                    }
                    String strP = D0().p();
                    long j10 = -1;
                    if (!TextUtils.isEmpty(strP)) {
                        if (this.f86625A == -1) {
                            C11367u c11367uD02 = D0();
                            try {
                                try {
                                    cursorRawQuery = c11367uD02.s0().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                    if (cursorRawQuery.moveToFirst()) {
                                        j10 = cursorRawQuery.getLong(0);
                                    }
                                } finally {
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                }
                            } catch (SQLiteException e11) {
                                c11367uD02.f85708a.a().m().b("Error querying raw events", e11);
                                if (cursorRawQuery != null) {
                                }
                            }
                            cursorRawQuery.close();
                            this.f86625A = j10;
                        }
                        q(strP, A10);
                    } else {
                        try {
                            this.f86625A = -1L;
                            c11367uD0 = D0();
                            z0();
                            jL = A10 - C11312m.l();
                            c11367uD0.f();
                            c11367uD0.h();
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = A10;
                        }
                        try {
                            A10 = c11367uD0.s0().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(jL)});
                            try {
                                if (!A10.moveToFirst()) {
                                    c11367uD0.f85708a.a().u().a("No expired configs for apps with pending events");
                                } else {
                                    string = A10.getString(0);
                                }
                            } catch (SQLiteException e12) {
                                e10 = e12;
                                c11367uD0.f85708a.a().m().b("Error selecting expired configs", e10);
                                if (A10 != 0) {
                                    A10.close();
                                }
                                if (!TextUtils.isEmpty(string)) {
                                    z(c11384w2H0);
                                }
                                this.f86656v = false;
                                Q();
                            }
                        } catch (SQLiteException e13) {
                            e10 = e13;
                            A10 = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                        }
                        A10.close();
                        if (!TextUtils.isEmpty(string) && (c11384w2H0 = D0().H0(string)) != null) {
                            z(c11384w2H0);
                        }
                    }
                }
            }
            this.f86656v = false;
            Q();
        } catch (Throwable th4) {
            this.f86656v = false;
            Q();
            throw th4;
        }
    }

    final void p0(String str, C11266g c11266g) {
        b().f();
        M0();
        C11367u c11367uD0 = D0();
        long j10 = c11266g.f86398a;
        t6 t6VarL = c11367uD0.l(j10);
        if (t6VarL == null) {
            a().p().c("[sgtm] Queued batch doesn't exist. appId, rowId", str, Long.valueOf(j10));
            return;
        }
        String strE = t6VarL.e();
        if (c11266g.f86399b == Qd.F.SUCCESS.zza()) {
            Map map = this.f86629E;
            if (map.containsKey(strE)) {
                map.remove(strE);
            }
            C11367u c11367uD02 = D0();
            Long lValueOf = Long.valueOf(j10);
            c11367uD02.o(lValueOf);
            a().u().c("[sgtm] queued batch deleted after successful client upload. appId, rowId", str, lValueOf);
            long j11 = c11266g.f86400c;
            if (j11 > 0) {
                C11367u c11367uD03 = D0();
                c11367uD03.f();
                c11367uD03.h();
                Long lValueOf2 = Long.valueOf(j11);
                com.google.android.gms.common.internal.r.l(lValueOf2);
                ContentValues contentValues = new ContentValues();
                contentValues.put("upload_type", Integer.valueOf(Qd.G.GOOGLE_SIGNAL.zza()));
                X2 x22 = c11367uD03.f85708a;
                contentValues.put("creation_timestamp", Long.valueOf(x22.zzaZ().a()));
                try {
                    if (c11367uD03.s0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j11), str, String.valueOf(Qd.G.GOOGLE_SIGNAL_PENDING.zza())}) != 1) {
                        x22.a().p().c("Google Signal pending batch not updated. appId, rowId", str, lValueOf2);
                    }
                    a().u().c("[sgtm] queued Google Signal batch updated. appId, signalRowId", str, Long.valueOf(c11266g.f86400c));
                    s(str);
                    return;
                } catch (SQLiteException e10) {
                    c11367uD03.f85708a.a().m().d("Failed to update google Signal pending batch. appid, rowId", str, Long.valueOf(j11), e10);
                    throw e10;
                }
            }
            return;
        }
        if (c11266g.f86399b == Qd.F.BACKOFF.zza()) {
            Map map2 = this.f86629E;
            o6 o6Var = (o6) map2.get(strE);
            if (o6Var == null) {
                o6Var = new o6(this);
                map2.put(strE, o6Var);
            } else {
                o6Var.a();
            }
            a().u().d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str, strE, Long.valueOf((o6Var.c() - zzaZ().a()) / 1000));
        }
        C11367u c11367uD04 = D0();
        Long lValueOf3 = Long.valueOf(c11266g.f86398a);
        c11367uD04.u(lValueOf3);
        a().u().c("[sgtm] increased batch retry count after failed client upload. appId, rowId", str, lValueOf3);
    }

    final void q0(boolean z10) {
        P();
    }

    final boolean r(String str, String str2) {
        C11384w2 c11384w2H0 = D0().H0(str);
        if (c11384w2H0 != null && L0().N(str, c11384w2H0.l0())) {
            this.f86629E.remove(str2);
            return true;
        }
        o6 o6Var = (o6) this.f86629E.get(str2);
        if (o6Var == null) {
            return true;
        }
        return o6Var.b();
    }

    public final void r0(String str, E4 e42) {
        b().f();
        String str2 = this.f86631G;
        if (str2 != null && !str2.equals(str) && e42 == null) {
            return;
        }
        this.f86631G = str;
        this.f86630F = e42;
    }

    final void s(String str) {
        t6 t6Var;
        com.google.android.gms.internal.measurement.Y2 y2D;
        b().f();
        M0();
        this.f86656v = true;
        try {
            X2 x22 = this.f86646l;
            x22.c();
            Boolean boolV = x22.H().v();
            if (boolV == null) {
                a().p().a("Upload data called on the client side before use of service was decided");
            } else if (boolV.booleanValue()) {
                a().m().a("Upload called in the client side when service should be used");
            } else if (this.f86649o > 0) {
                P();
            } else if (!C0().k()) {
                a().u().a("Network not connected, ignoring upload request");
                P();
            } else if (!D0().n(str)) {
                a().u().b("[sgtm] Upload queue has no batches for appId", str);
            } else {
                C11367u c11367uD0 = D0();
                com.google.android.gms.common.internal.r.f(str);
                c11367uD0.f();
                c11367uD0.h();
                List listM = c11367uD0.m(str, Qd.J.B(Qd.G.GOOGLE_SIGNAL), 1);
                if (listM.isEmpty()) {
                    t6Var = null;
                } else {
                    t6Var = (t6) listM.get(0);
                }
                if (t6Var != null && (y2D = t6Var.d()) != null) {
                    a().u().d("[sgtm] Uploading data from upload queue. appId, type, url", str, t6Var.f(), t6Var.e());
                    byte[] bArrG = y2D.g();
                    if (Log.isLoggable(a().x(), 2)) {
                        a().u().d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrG.length), I0().I(y2D));
                    }
                    C11241c6 c11241c6A = t6Var.a();
                    this.f86655u = true;
                    C0().l(str, c11241c6A, y2D, new C11273g6(this, str, t6Var));
                }
            }
            this.f86656v = false;
            Q();
        } catch (Throwable th2) {
            this.f86656v = false;
            Q();
            throw th2;
        }
    }

    final /* synthetic */ void s0(r6 r6Var) {
        b().f();
        this.f86645k = new H2(this);
        C11367u c11367u = new C11367u(this);
        c11367u.i();
        this.f86637c = c11367u;
        z0().r((InterfaceC11305l) com.google.android.gms.common.internal.r.l(this.f86635a));
        C11401y5 c11401y5 = new C11401y5(this);
        c11401y5.i();
        this.f86643i = c11401y5;
        C11250e c11250e = new C11250e(this);
        c11250e.i();
        this.f86640f = c11250e;
        C4 c42 = new C4(this);
        c42.i();
        this.f86642h = c42;
        V5 v52 = new V5(this);
        v52.i();
        this.f86639e = v52;
        this.f86638d = new C11398y2(this);
        if (this.f86652r != this.f86653s) {
            a().m().c("Not all upload components initialized", Integer.valueOf(this.f86652r), Integer.valueOf(this.f86653s));
        }
        this.f86647m.set(true);
        a().u().a("UploadController is now fully initialized");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001e A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:4:0x000d, B:19:0x005a, B:22:0x0080, B:13:0x001e, B:15:0x0048, B:17:0x0052, B:18:0x0056), top: B:27:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void t(java.lang.String r4, int r5, java.lang.Throwable r6, byte[] r7, com.google.android.gms.measurement.internal.t6 r8) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.T2 r0 = r3.b()
            r0.f()
            r3.M0()
            r0 = 0
            if (r7 != 0) goto L13
            byte[] r7 = new byte[r0]     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r4 = move-exception
            goto L9b
        L13:
            r1 = 200(0xc8, float:2.8E-43)
            if (r5 == r1) goto L1c
            r1 = 204(0xcc, float:2.86E-43)
            if (r5 != r1) goto L5a
            r5 = r1
        L1c:
            if (r6 != 0) goto L5a
            com.google.android.gms.measurement.internal.u r6 = r3.D0()     // Catch: java.lang.Throwable -> L10
            long r7 = r8.c()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L10
            r6.o(r7)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.q2 r6 = r3.a()     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.o2 r6 = r6.u()     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = "Successfully uploaded batch from upload queue. appId, status"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            r6.c(r7, r4, r5)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.v2 r5 = r3.C0()     // Catch: java.lang.Throwable -> L10
            boolean r5 = r5.k()     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L56
            com.google.android.gms.measurement.internal.u r5 = r3.D0()     // Catch: java.lang.Throwable -> L10
            boolean r5 = r5.n(r4)     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L56
            r3.s(r4)     // Catch: java.lang.Throwable -> L10
            goto L95
        L56:
            r3.P()     // Catch: java.lang.Throwable -> L10
            goto L95
        L5a:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L10
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L10
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L10
            int r7 = r1.length()     // Catch: java.lang.Throwable -> L10
            r2 = 32
            int r7 = java.lang.Math.min(r2, r7)     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = r1.substring(r0, r7)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.q2 r1 = r3.a()     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.o2 r1 = r1.r()     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = "Network upload failed. Will retry later. appId, status, error"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            if (r6 != 0) goto L80
            r6 = r7
        L80:
            r1.d(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.u r4 = r3.D0()     // Catch: java.lang.Throwable -> L10
            long r5 = r8.c()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            r4.u(r5)     // Catch: java.lang.Throwable -> L10
            r3.P()     // Catch: java.lang.Throwable -> L10
        L95:
            r3.f86655u = r0
            r3.Q()
            return
        L9b:
            r3.f86655u = r0
            r3.Q()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q6.t(java.lang.String, int, java.lang.Throwable, byte[], com.google.android.gms.measurement.internal.t6):void");
    }

    final void u(String str, boolean z10, Long l10, Long l11) {
        C11384w2 c11384w2H0 = D0().H0(str);
        if (c11384w2H0 != null) {
            c11384w2H0.e0(z10);
            c11384w2H0.g0(l10);
            c11384w2H0.i0(l11);
            if (c11384w2H0.A()) {
                D0().I0(c11384w2H0, false, false);
            }
        }
    }

    final void v(String str, com.google.android.gms.internal.measurement.Z2 z22) {
        int iV;
        int iIndexOf;
        Set setD = B0().D(str);
        if (setD != null) {
            z22.M0(setD);
        }
        if (B0().H(str)) {
            z22.z();
        }
        if (B0().I(str)) {
            String strW = z22.w();
            if (!TextUtils.isEmpty(strW) && (iIndexOf = strW.indexOf(".")) != -1) {
                z22.x(strW.substring(0, iIndexOf));
            }
        }
        if (B0().J(str) && (iV = u6.V(z22, "_id")) != -1) {
            z22.k1(iV);
        }
        if (B0().K(str)) {
            z22.C0();
        }
        if (B0().L(str)) {
            z22.R();
            if (e(str).o(Qd.v.ANALYTICS_STORAGE)) {
                Map map = this.f86628D;
                n6 n6Var = (n6) map.get(str);
                if (n6Var == null || n6Var.f86565b + z0().B(str, C11245d2.f86324l0) < zzaZ().c()) {
                    n6Var = new n6(this, (byte[]) null);
                    map.put(str, n6Var);
                }
                z22.N0(n6Var.f86564a);
            }
        }
        if (B0().M(str)) {
            z22.L0();
        }
    }

    protected final void y0() {
        b().f();
        D0().s();
        C11367u c11367uD0 = D0();
        c11367uD0.f();
        c11367uD0.h();
        if (c11367uD0.Y()) {
            C11237c2 c11237c2 = C11245d2.f86347w0;
            if (((Long) c11237c2.b(null)).longValue() != 0) {
                SQLiteDatabase sQLiteDatabaseS0 = c11367uD0.s0();
                X2 x22 = c11367uD0.f85708a;
                int iDelete = sQLiteDatabaseS0.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(x22.zzaZ().a()), String.valueOf(c11237c2.b(null))});
                if (iDelete > 0) {
                    x22.a().u().b("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(iDelete));
                }
            }
        }
        if (this.f86643i.f86892h.a() == 0) {
            this.f86643i.f86892h.b(zzaZ().a());
        }
        P();
    }

    final void z(C11384w2 c11384w2) {
        b().f();
        if (TextUtils.isEmpty(c11384w2.r0())) {
            A((String) com.google.android.gms.common.internal.r.l(c11384w2.o0()), HttpResponseStatus.SUCCESS_NO_CONTENT, null, null, null);
            return;
        }
        String str = (String) com.google.android.gms.common.internal.r.l(c11384w2.o0());
        a().u().b("Fetching remote configuration", str);
        C10536g2 c10536g2U = B0().u(str);
        String strW = B0().w(str);
        C5603a c5603a = null;
        if (c10536g2U != null) {
            if (!TextUtils.isEmpty(strW)) {
                c5603a = new C5603a();
                c5603a.put("If-Modified-Since", strW);
            }
            String strX = B0().x(str);
            if (!TextUtils.isEmpty(strX)) {
                if (c5603a == null) {
                    c5603a = new C5603a();
                }
                c5603a.put("If-None-Match", strX);
            }
        }
        this.f86654t = true;
        C0().m(c11384w2, c5603a, new InterfaceC11356s2() { // from class: com.google.android.gms.measurement.internal.p6
            @Override // com.google.android.gms.measurement.internal.InterfaceC11356s2
            public final /* synthetic */ void a(String str2, int i10, Throwable th2, byte[] bArr, Map map) {
                this.f86595a.A(str2, i10, th2, bArr, map);
            }
        });
    }
}
