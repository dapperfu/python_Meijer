package uf;

import android.util.Base64;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tf.AbstractC17251F;
import tf.C17253a;

/* loaded from: classes8.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final Df.a f163922a = new Ff.d().j(C17253a.f162659a).k(true).i();

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

    public AbstractC17251F L(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                AbstractC17251F abstractC17251FH = H(jsonReader);
                jsonReader.close();
                return abstractC17251FH;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    public String M(AbstractC17251F abstractC17251F) {
        return f163922a.b(abstractC17251F);
    }

    public AbstractC17251F.e.d j(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                AbstractC17251F.e.d dVarR = r(jsonReader);
                jsonReader.close();
                return dVarR;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    public String k(AbstractC17251F.e.d dVar) {
        return f163922a.b(dVar);
    }

    private static AbstractC17251F.e.d.f A(JsonReader jsonReader) throws IOException {
        AbstractC17251F.e.d.f.a aVarA = AbstractC17251F.e.d.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("assignments")) {
                jsonReader.skipValue();
            } else {
                aVarA.b(n(jsonReader, new a() { // from class: uf.f
                    @Override // uf.j.a
                    public final Object a(JsonReader jsonReader2) {
                        return j.z(jsonReader2);
                    }
                }));
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static AbstractC17251F.e.d.a.b.AbstractC2560d B(JsonReader jsonReader) throws IOException {
        AbstractC17251F.e.d.a.b.AbstractC2560d.AbstractC2561a abstractC2561aA = AbstractC17251F.e.d.a.b.AbstractC2560d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "address":
                    abstractC2561aA.b(jsonReader.nextLong());
                    break;
                case "code":
                    abstractC2561aA.c(jsonReader.nextString());
                    break;
                case "name":
                    abstractC2561aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC2561aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC17251F.e.d.a.b.AbstractC2562e C(JsonReader jsonReader) throws IOException {
        AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2563a abstractC2563aA = AbstractC17251F.e.d.a.b.AbstractC2562e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    abstractC2563aA.b(n(jsonReader, new i()));
                    break;
                case "name":
                    abstractC2563aA.d(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC2563aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC2563aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC17251F.d.b D(JsonReader jsonReader) throws IOException {
        AbstractC17251F.d.b.a aVarA = AbstractC17251F.d.b.a();
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

    private static AbstractC17251F.d E(JsonReader jsonReader) throws IOException {
        AbstractC17251F.d.a aVarA = AbstractC17251F.d.a();
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
                aVarA.b(n(jsonReader, new a() { // from class: uf.e
                    @Override // uf.j.a
                    public final Object a(JsonReader jsonReader2) {
                        return j.D(jsonReader2);
                    }
                }));
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    private static AbstractC17251F.e.AbstractC2569e F(JsonReader jsonReader) throws IOException {
        AbstractC17251F.e.AbstractC2569e.a aVarA = AbstractC17251F.e.AbstractC2569e.a();
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
    public static AbstractC17251F.e.d.a.c G(JsonReader jsonReader) throws IOException {
        AbstractC17251F.e.d.a.c.AbstractC2566a abstractC2566aA = AbstractC17251F.e.d.a.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    abstractC2566aA.d(jsonReader.nextInt());
                    break;
                case "processName":
                    abstractC2566aA.e(jsonReader.nextString());
                    break;
                case "defaultProcess":
                    abstractC2566aA.b(jsonReader.nextBoolean());
                    break;
                case "importance":
                    abstractC2566aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC2566aA.a();
    }

    private static AbstractC17251F H(JsonReader jsonReader) throws IOException {
        AbstractC17251F.b bVarB = AbstractC17251F.b();
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

    private static AbstractC17251F.e.d.AbstractC2568e.b I(JsonReader jsonReader) throws IOException {
        AbstractC17251F.e.d.AbstractC2568e.b.a aVarA = AbstractC17251F.e.d.AbstractC2568e.b.a();
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

    private static AbstractC17251F.e J(JsonReader jsonReader) throws IOException {
        AbstractC17251F.e.b bVarA = AbstractC17251F.e.a();
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
                    bVarA.g(n(jsonReader, new a() { // from class: uf.d
                        @Override // uf.j.a
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

    private static AbstractC17251F.e.f K(JsonReader jsonReader) throws IOException {
        AbstractC17251F.e.f.a aVarA = AbstractC17251F.e.f.a();
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

    private static AbstractC17251F.e.a l(JsonReader jsonReader) throws IOException {
        AbstractC17251F.e.a.AbstractC2554a abstractC2554aA = AbstractC17251F.e.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "identifier":
                    abstractC2554aA.e(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    abstractC2554aA.b(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    abstractC2554aA.c(jsonReader.nextString());
                    break;
                case "version":
                    abstractC2554aA.g(jsonReader.nextString());
                    break;
                case "installationUuid":
                    abstractC2554aA.f(jsonReader.nextString());
                    break;
                case "displayVersion":
                    abstractC2554aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC2554aA.a();
    }

    private static AbstractC17251F.a m(JsonReader jsonReader) throws IOException {
        AbstractC17251F.a.b bVarA = AbstractC17251F.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    bVarA.b(n(jsonReader, new a() { // from class: uf.a
                        @Override // uf.j.a
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
    public static AbstractC17251F.a.AbstractC2552a o(JsonReader jsonReader) throws IOException {
        AbstractC17251F.a.AbstractC2552a.AbstractC2553a abstractC2553aA = AbstractC17251F.a.AbstractC2552a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "libraryName":
                    abstractC2553aA.d(jsonReader.nextString());
                    break;
                case "arch":
                    abstractC2553aA.b(jsonReader.nextString());
                    break;
                case "buildId":
                    abstractC2553aA.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC2553aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC17251F.c p(JsonReader jsonReader) throws IOException {
        AbstractC17251F.c.a aVarA = AbstractC17251F.c.a();
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

    private static AbstractC17251F.e.c q(JsonReader jsonReader) throws IOException {
        AbstractC17251F.e.c.a aVarA = AbstractC17251F.e.c.a();
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
    public static AbstractC17251F.e.d r(JsonReader jsonReader) throws IOException {
        AbstractC17251F.e.d.b bVarA = AbstractC17251F.e.d.a();
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

    private static AbstractC17251F.e.d.a s(JsonReader jsonReader) throws IOException {
        AbstractC17251F.e.d.a.AbstractC2555a abstractC2555aA = AbstractC17251F.e.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "appProcessDetails":
                    abstractC2555aA.b(n(jsonReader, new a() { // from class: uf.c
                        @Override // uf.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.G(jsonReader2);
                        }
                    }));
                    break;
                case "background":
                    abstractC2555aA.c(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    abstractC2555aA.f(v(jsonReader));
                    break;
                case "internalKeys":
                    abstractC2555aA.g(n(jsonReader, new a() { // from class: uf.b
                        @Override // uf.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.p(jsonReader2);
                        }
                    }));
                    break;
                case "customAttributes":
                    abstractC2555aA.e(n(jsonReader, new a() { // from class: uf.b
                        @Override // uf.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.p(jsonReader2);
                        }
                    }));
                    break;
                case "uiOrientation":
                    abstractC2555aA.h(jsonReader.nextInt());
                    break;
                case "currentProcessDetails":
                    abstractC2555aA.d(G(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC2555aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC17251F.e.d.a.b.AbstractC2556a t(JsonReader jsonReader) throws IOException {
        AbstractC17251F.e.d.a.b.AbstractC2556a.AbstractC2557a abstractC2557aA = AbstractC17251F.e.d.a.b.AbstractC2556a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "name":
                    abstractC2557aA.c(jsonReader.nextString());
                    break;
                case "size":
                    abstractC2557aA.d(jsonReader.nextLong());
                    break;
                case "uuid":
                    abstractC2557aA.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    abstractC2557aA.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC2557aA.a();
    }

    private static AbstractC17251F.e.d.c u(JsonReader jsonReader) throws IOException {
        AbstractC17251F.e.d.c.a aVarA = AbstractC17251F.e.d.c.a();
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

    private static AbstractC17251F.e.d.a.b v(JsonReader jsonReader) throws IOException {
        AbstractC17251F.e.d.a.b.AbstractC2558b abstractC2558bA = AbstractC17251F.e.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "appExitInfo":
                    abstractC2558bA.b(m(jsonReader));
                    break;
                case "threads":
                    abstractC2558bA.f(n(jsonReader, new a() { // from class: uf.g
                        @Override // uf.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.C(jsonReader2);
                        }
                    }));
                    break;
                case "signal":
                    abstractC2558bA.e(B(jsonReader));
                    break;
                case "binaries":
                    abstractC2558bA.c(n(jsonReader, new a() { // from class: uf.h
                        @Override // uf.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.t(jsonReader2);
                        }
                    }));
                    break;
                case "exception":
                    abstractC2558bA.d(w(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC2558bA.a();
    }

    private static AbstractC17251F.e.d.a.b.c w(JsonReader jsonReader) throws IOException {
        AbstractC17251F.e.d.a.b.c.AbstractC2559a abstractC2559aA = AbstractC17251F.e.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    abstractC2559aA.c(n(jsonReader, new i()));
                    break;
                case "reason":
                    abstractC2559aA.e(jsonReader.nextString());
                    break;
                case "type":
                    abstractC2559aA.f(jsonReader.nextString());
                    break;
                case "causedBy":
                    abstractC2559aA.b(w(jsonReader));
                    break;
                case "overflowCount":
                    abstractC2559aA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC2559aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b x(JsonReader jsonReader) throws IOException {
        AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b.AbstractC2565a abstractC2565aA = AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    abstractC2565aA.d(jsonReader.nextLong());
                    break;
                case "symbol":
                    abstractC2565aA.f(jsonReader.nextString());
                    break;
                case "pc":
                    abstractC2565aA.e(jsonReader.nextLong());
                    break;
                case "file":
                    abstractC2565aA.b(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC2565aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC2565aA.a();
    }

    private static AbstractC17251F.e.d.AbstractC2567d y(JsonReader jsonReader) throws IOException {
        AbstractC17251F.e.d.AbstractC2567d.a aVarA = AbstractC17251F.e.d.AbstractC2567d.a();
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
    public static AbstractC17251F.e.d.AbstractC2568e z(JsonReader jsonReader) throws IOException {
        AbstractC17251F.e.d.AbstractC2568e.a aVarA = AbstractC17251F.e.d.AbstractC2568e.a();
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
