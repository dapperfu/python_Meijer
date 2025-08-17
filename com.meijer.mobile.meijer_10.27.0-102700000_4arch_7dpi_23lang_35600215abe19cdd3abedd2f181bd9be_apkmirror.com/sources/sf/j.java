package sf;

import android.util.Base64;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rf.AbstractC16777F;
import rf.C16779a;

/* loaded from: classes7.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final Bf.a f160436a = new Df.d().j(C16779a.f158213a).k(true).i();

    /* JADX INFO: Access modifiers changed from: private */
    interface a<T> {
        T a(JsonReader jsonReader) throws IOException;
    }

    private static <T> List<T> n(JsonReader jsonReader, a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    public AbstractC16777F L(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                AbstractC16777F abstractC16777FH = H(jsonReader);
                jsonReader.close();
                return abstractC16777FH;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    public String M(AbstractC16777F abstractC16777F) {
        return f160436a.b(abstractC16777F);
    }

    public AbstractC16777F.e.d j(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                AbstractC16777F.e.d dVarR = r(jsonReader);
                jsonReader.close();
                return dVarR;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    public String k(AbstractC16777F.e.d dVar) {
        return f160436a.b(dVar);
    }

    private static AbstractC16777F.e.d.f A(JsonReader jsonReader) throws IOException {
        AbstractC16777F.e.d.f.a aVarA = AbstractC16777F.e.d.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("assignments")) {
                jsonReader.skipValue();
            } else {
                aVarA.b(n(jsonReader, new a() { // from class: sf.f
                    @Override // sf.j.a
                    public final Object a(JsonReader jsonReader2) {
                        return j.z(jsonReader2);
                    }
                }));
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static AbstractC16777F.e.d.a.b.AbstractC2454d B(JsonReader jsonReader) throws IOException {
        AbstractC16777F.e.d.a.b.AbstractC2454d.AbstractC2455a abstractC2455aA = AbstractC16777F.e.d.a.b.AbstractC2454d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "address":
                    abstractC2455aA.b(jsonReader.nextLong());
                    break;
                case "code":
                    abstractC2455aA.c(jsonReader.nextString());
                    break;
                case "name":
                    abstractC2455aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC2455aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC16777F.e.d.a.b.AbstractC2456e C(JsonReader jsonReader) throws IOException {
        AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2457a abstractC2457aA = AbstractC16777F.e.d.a.b.AbstractC2456e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    abstractC2457aA.b(n(jsonReader, new i()));
                    break;
                case "name":
                    abstractC2457aA.d(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC2457aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC2457aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC16777F.d.b D(JsonReader jsonReader) throws IOException {
        AbstractC16777F.d.b.a aVarA = AbstractC16777F.d.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("filename")) {
                if (!strNextName.equals("contents")) {
                    jsonReader.skipValue();
                } else {
                    aVarA.b(Base64.decode(jsonReader.nextString(), 2));
                }
            } else {
                aVarA.c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static AbstractC16777F.d E(JsonReader jsonReader) throws IOException {
        AbstractC16777F.d.a aVarA = AbstractC16777F.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("files")) {
                if (!strNextName.equals("orgId")) {
                    jsonReader.skipValue();
                } else {
                    aVarA.c(jsonReader.nextString());
                }
            } else {
                aVarA.b(n(jsonReader, new a() { // from class: sf.e
                    @Override // sf.j.a
                    public final Object a(JsonReader jsonReader2) {
                        return j.D(jsonReader2);
                    }
                }));
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static AbstractC16777F.e.AbstractC2463e F(JsonReader jsonReader) throws IOException {
        AbstractC16777F.e.AbstractC2463e.a aVarA = AbstractC16777F.e.AbstractC2463e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildVersion":
                    aVarA.b(jsonReader.nextString());
                    break;
                case "jailbroken":
                    aVarA.c(jsonReader.nextBoolean());
                    break;
                case "version":
                    aVarA.e(jsonReader.nextString());
                    break;
                case "platform":
                    aVarA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC16777F.e.d.a.c G(JsonReader jsonReader) throws IOException {
        AbstractC16777F.e.d.a.c.AbstractC2460a abstractC2460aA = AbstractC16777F.e.d.a.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    abstractC2460aA.d(jsonReader.nextInt());
                    break;
                case "processName":
                    abstractC2460aA.e(jsonReader.nextString());
                    break;
                case "defaultProcess":
                    abstractC2460aA.b(jsonReader.nextBoolean());
                    break;
                case "importance":
                    abstractC2460aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC2460aA.a();
    }

    private static AbstractC16777F H(JsonReader jsonReader) throws IOException {
        AbstractC16777F.b bVarB = AbstractC16777F.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    bVarB.j(E(jsonReader));
                    break;
                case "sdkVersion":
                    bVarB.l(jsonReader.nextString());
                    break;
                case "appQualitySessionId":
                    bVarB.c(jsonReader.nextString());
                    break;
                case "appExitInfo":
                    bVarB.b(m(jsonReader));
                    break;
                case "buildVersion":
                    bVarB.d(jsonReader.nextString());
                    break;
                case "firebaseAuthenticationToken":
                    bVarB.f(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    bVarB.h(jsonReader.nextString());
                    break;
                case "installationUuid":
                    bVarB.i(jsonReader.nextString());
                    break;
                case "firebaseInstallationId":
                    bVarB.g(jsonReader.nextString());
                    break;
                case "platform":
                    bVarB.k(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    bVarB.e(jsonReader.nextString());
                    break;
                case "session":
                    bVarB.m(J(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarB.a();
    }

    private static AbstractC16777F.e.d.AbstractC2462e.b I(JsonReader jsonReader) throws IOException {
        AbstractC16777F.e.d.AbstractC2462e.b.a aVarA = AbstractC16777F.e.d.AbstractC2462e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("variantId")) {
                if (!strNextName.equals("rolloutId")) {
                    jsonReader.skipValue();
                } else {
                    aVarA.b(jsonReader.nextString());
                }
            } else {
                aVarA.c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static AbstractC16777F.e J(JsonReader jsonReader) throws IOException {
        AbstractC16777F.e.b bVarA = AbstractC16777F.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "startedAt":
                    bVarA.m(jsonReader.nextLong());
                    break;
                case "appQualitySessionId":
                    bVarA.c(jsonReader.nextString());
                    break;
                case "identifier":
                    bVarA.k(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "endedAt":
                    bVarA.f(Long.valueOf(jsonReader.nextLong()));
                    break;
                case "device":
                    bVarA.e(q(jsonReader));
                    break;
                case "events":
                    bVarA.g(n(jsonReader, new a() { // from class: sf.d
                        @Override // sf.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.r(jsonReader2);
                        }
                    }));
                    break;
                case "os":
                    bVarA.l(F(jsonReader));
                    break;
                case "app":
                    bVarA.b(l(jsonReader));
                    break;
                case "user":
                    bVarA.n(K(jsonReader));
                    break;
                case "generator":
                    bVarA.h(jsonReader.nextString());
                    break;
                case "crashed":
                    bVarA.d(jsonReader.nextBoolean());
                    break;
                case "generatorType":
                    bVarA.i(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    private static AbstractC16777F.e.f K(JsonReader jsonReader) throws IOException {
        AbstractC16777F.e.f.a aVarA = AbstractC16777F.e.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static AbstractC16777F.e.a l(JsonReader jsonReader) throws IOException {
        AbstractC16777F.e.a.AbstractC2448a abstractC2448aA = AbstractC16777F.e.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "identifier":
                    abstractC2448aA.e(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    abstractC2448aA.b(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    abstractC2448aA.c(jsonReader.nextString());
                    break;
                case "version":
                    abstractC2448aA.g(jsonReader.nextString());
                    break;
                case "installationUuid":
                    abstractC2448aA.f(jsonReader.nextString());
                    break;
                case "displayVersion":
                    abstractC2448aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC2448aA.a();
    }

    private static AbstractC16777F.a m(JsonReader jsonReader) throws IOException {
        AbstractC16777F.a.b bVarA = AbstractC16777F.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    bVarA.b(n(jsonReader, new a() { // from class: sf.a
                        @Override // sf.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.o(jsonReader2);
                        }
                    }));
                    break;
                case "pid":
                    bVarA.d(jsonReader.nextInt());
                    break;
                case "pss":
                    bVarA.f(jsonReader.nextLong());
                    break;
                case "rss":
                    bVarA.h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    bVarA.i(jsonReader.nextLong());
                    break;
                case "processName":
                    bVarA.e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    bVarA.g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    bVarA.j(jsonReader.nextString());
                    break;
                case "importance":
                    bVarA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC16777F.a.AbstractC2446a o(JsonReader jsonReader) throws IOException {
        AbstractC16777F.a.AbstractC2446a.AbstractC2447a abstractC2447aA = AbstractC16777F.a.AbstractC2446a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "libraryName":
                    abstractC2447aA.d(jsonReader.nextString());
                    break;
                case "arch":
                    abstractC2447aA.b(jsonReader.nextString());
                    break;
                case "buildId":
                    abstractC2447aA.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC2447aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC16777F.c p(JsonReader jsonReader) throws IOException {
        AbstractC16777F.c.a aVarA = AbstractC16777F.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("key")) {
                if (!strNextName.equals("value")) {
                    jsonReader.skipValue();
                } else {
                    aVarA.c(jsonReader.nextString());
                }
            } else {
                aVarA.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static AbstractC16777F.e.c q(JsonReader jsonReader) throws IOException {
        AbstractC16777F.e.c.a aVarA = AbstractC16777F.e.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "simulator":
                    aVarA.i(jsonReader.nextBoolean());
                    break;
                case "manufacturer":
                    aVarA.e(jsonReader.nextString());
                    break;
                case "ram":
                    aVarA.h(jsonReader.nextLong());
                    break;
                case "arch":
                    aVarA.b(jsonReader.nextInt());
                    break;
                case "diskSpace":
                    aVarA.d(jsonReader.nextLong());
                    break;
                case "cores":
                    aVarA.c(jsonReader.nextInt());
                    break;
                case "model":
                    aVarA.f(jsonReader.nextString());
                    break;
                case "state":
                    aVarA.j(jsonReader.nextInt());
                    break;
                case "modelClass":
                    aVarA.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC16777F.e.d r(JsonReader jsonReader) throws IOException {
        AbstractC16777F.e.d.b bVarA = AbstractC16777F.e.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "device":
                    bVarA.c(u(jsonReader));
                    break;
                case "rollouts":
                    bVarA.e(A(jsonReader));
                    break;
                case "app":
                    bVarA.b(s(jsonReader));
                    break;
                case "log":
                    bVarA.d(y(jsonReader));
                    break;
                case "type":
                    bVarA.g(jsonReader.nextString());
                    break;
                case "timestamp":
                    bVarA.f(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    private static AbstractC16777F.e.d.a s(JsonReader jsonReader) throws IOException {
        AbstractC16777F.e.d.a.AbstractC2449a abstractC2449aA = AbstractC16777F.e.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "appProcessDetails":
                    abstractC2449aA.b(n(jsonReader, new a() { // from class: sf.c
                        @Override // sf.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.G(jsonReader2);
                        }
                    }));
                    break;
                case "background":
                    abstractC2449aA.c(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    abstractC2449aA.f(v(jsonReader));
                    break;
                case "internalKeys":
                    abstractC2449aA.g(n(jsonReader, new a() { // from class: sf.b
                        @Override // sf.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.p(jsonReader2);
                        }
                    }));
                    break;
                case "customAttributes":
                    abstractC2449aA.e(n(jsonReader, new a() { // from class: sf.b
                        @Override // sf.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.p(jsonReader2);
                        }
                    }));
                    break;
                case "uiOrientation":
                    abstractC2449aA.h(jsonReader.nextInt());
                    break;
                case "currentProcessDetails":
                    abstractC2449aA.d(G(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC2449aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC16777F.e.d.a.b.AbstractC2450a t(JsonReader jsonReader) throws IOException {
        AbstractC16777F.e.d.a.b.AbstractC2450a.AbstractC2451a abstractC2451aA = AbstractC16777F.e.d.a.b.AbstractC2450a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "name":
                    abstractC2451aA.c(jsonReader.nextString());
                    break;
                case "size":
                    abstractC2451aA.d(jsonReader.nextLong());
                    break;
                case "uuid":
                    abstractC2451aA.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    abstractC2451aA.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC2451aA.a();
    }

    private static AbstractC16777F.e.d.c u(JsonReader jsonReader) throws IOException {
        AbstractC16777F.e.d.c.a aVarA = AbstractC16777F.e.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "batteryLevel":
                    aVarA.b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case "batteryVelocity":
                    aVarA.c(jsonReader.nextInt());
                    break;
                case "orientation":
                    aVarA.e(jsonReader.nextInt());
                    break;
                case "diskUsed":
                    aVarA.d(jsonReader.nextLong());
                    break;
                case "ramUsed":
                    aVarA.g(jsonReader.nextLong());
                    break;
                case "proximityOn":
                    aVarA.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static AbstractC16777F.e.d.a.b v(JsonReader jsonReader) throws IOException {
        AbstractC16777F.e.d.a.b.AbstractC2452b abstractC2452bA = AbstractC16777F.e.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "appExitInfo":
                    abstractC2452bA.b(m(jsonReader));
                    break;
                case "threads":
                    abstractC2452bA.f(n(jsonReader, new a() { // from class: sf.g
                        @Override // sf.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.C(jsonReader2);
                        }
                    }));
                    break;
                case "signal":
                    abstractC2452bA.e(B(jsonReader));
                    break;
                case "binaries":
                    abstractC2452bA.c(n(jsonReader, new a() { // from class: sf.h
                        @Override // sf.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.t(jsonReader2);
                        }
                    }));
                    break;
                case "exception":
                    abstractC2452bA.d(w(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC2452bA.a();
    }

    private static AbstractC16777F.e.d.a.b.c w(JsonReader jsonReader) throws IOException {
        AbstractC16777F.e.d.a.b.c.AbstractC2453a abstractC2453aA = AbstractC16777F.e.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    abstractC2453aA.c(n(jsonReader, new i()));
                    break;
                case "reason":
                    abstractC2453aA.e(jsonReader.nextString());
                    break;
                case "type":
                    abstractC2453aA.f(jsonReader.nextString());
                    break;
                case "causedBy":
                    abstractC2453aA.b(w(jsonReader));
                    break;
                case "overflowCount":
                    abstractC2453aA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC2453aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b x(JsonReader jsonReader) throws IOException {
        AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b.AbstractC2459a abstractC2459aA = AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    abstractC2459aA.d(jsonReader.nextLong());
                    break;
                case "symbol":
                    abstractC2459aA.f(jsonReader.nextString());
                    break;
                case "pc":
                    abstractC2459aA.e(jsonReader.nextLong());
                    break;
                case "file":
                    abstractC2459aA.b(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC2459aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC2459aA.a();
    }

    private static AbstractC16777F.e.d.AbstractC2461d y(JsonReader jsonReader) throws IOException {
        AbstractC16777F.e.d.AbstractC2461d.a aVarA = AbstractC16777F.e.d.AbstractC2461d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("content")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC16777F.e.d.AbstractC2462e z(JsonReader jsonReader) throws IOException {
        AbstractC16777F.e.d.AbstractC2462e.a aVarA = AbstractC16777F.e.d.AbstractC2462e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "parameterKey":
                    aVarA.b(jsonReader.nextString());
                    break;
                case "templateVersion":
                    aVarA.e(jsonReader.nextLong());
                    break;
                case "rolloutVariant":
                    aVarA.d(I(jsonReader));
                    break;
                case "parameterValue":
                    aVarA.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }
}
