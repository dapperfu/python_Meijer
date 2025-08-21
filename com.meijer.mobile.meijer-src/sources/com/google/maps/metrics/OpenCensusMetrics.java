package com.google.maps.metrics;

import Fu.a;
import Fu.i;
import Fu.j;
import Fu.m;
import Fu.p;
import Fu.q;
import Gu.h;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class OpenCensusMetrics {

    private static final class Aggregations {
        private static final a COUNT = a.b.a();
        private static final a DISTRIBUTION_INTEGERS_10;
        private static final a DISTRIBUTION_LATENCY;

        static {
            Double dValueOf = Double.valueOf(0.0d);
            DISTRIBUTION_INTEGERS_10 = a.c.a(i.a(Arrays.asList(dValueOf, Double.valueOf(1.0d), Double.valueOf(2.0d), Double.valueOf(3.0d), Double.valueOf(4.0d), Double.valueOf(5.0d), Double.valueOf(6.0d), Double.valueOf(7.0d), Double.valueOf(8.0d), Double.valueOf(9.0d), Double.valueOf(10.0d))));
            DISTRIBUTION_LATENCY = a.c.a(i.a(Arrays.asList(dValueOf, Double.valueOf(20.0d), Double.valueOf(25.2d), Double.valueOf(31.7d), Double.valueOf(40.0d), Double.valueOf(50.4d), Double.valueOf(63.5d), Double.valueOf(80.0d), Double.valueOf(100.8d), Double.valueOf(127.0d), Double.valueOf(160.0d), Double.valueOf(201.6d), Double.valueOf(254.0d), Double.valueOf(320.0d), Double.valueOf(403.2d), Double.valueOf(508.0d), Double.valueOf(640.0d), Double.valueOf(806.3d), Double.valueOf(1015.9d), Double.valueOf(1280.0d), Double.valueOf(1612.7d), Double.valueOf(2031.9d), Double.valueOf(2560.0d), Double.valueOf(3225.4d), Double.valueOf(4063.7d))));
        }

        private Aggregations() {
        }
    }

    public static final class Views {
        public static final p NETWORK_LATENCY;
        public static final p REQUEST_COUNT;
        public static final p REQUEST_LATENCY;
        public static final p RETRY_COUNT;
        private static final List<h> fields;

        static {
            List<h> listTags = OpenCensusMetrics.tags(Tags.REQUEST_NAME, Tags.HTTP_CODE, Tags.API_STATUS);
            fields = listTags;
            p.c cVarB = p.c.b("maps.googleapis.com/client/request_count");
            j.b bVar = Measures.LATENCY;
            REQUEST_COUNT = p.a(cVarB, "Request counts", bVar, Aggregations.COUNT, listTags);
            REQUEST_LATENCY = p.a(p.c.b("maps.googleapis.com/client/request_latency"), "Latency in msecs", bVar, Aggregations.DISTRIBUTION_LATENCY, listTags);
            NETWORK_LATENCY = p.a(p.c.b("maps.googleapis.com/client/network_latency"), "Network latency in msecs (internal)", Measures.NETWORK_LATENCY, Aggregations.DISTRIBUTION_LATENCY, listTags);
            RETRY_COUNT = p.a(p.c.b("maps.googleapis.com/client/retry_count"), "Retries per request", Measures.RETRY_COUNT, Aggregations.DISTRIBUTION_INTEGERS_10, listTags);
        }

        private Views() {
        }
    }

    public static void registerAllViews() {
        registerAllViews(m.b());
    }

    public static final class Measures {
        public static final j.b LATENCY = j.b.a("maps.googleapis.com/measure/client/latency", "Total time between library method called and results returned", "ms");
        public static final j.b NETWORK_LATENCY = j.b.a("maps.googleapis.com/measure/client/network_latency", "Network time inside the library", "ms");
        public static final j.b RETRY_COUNT = j.b.a("maps.googleapis.com/measure/client/retry_count", "How many times any request was retried", "1");

        private Measures() {
        }
    }

    public static final class Tags {
        public static final h REQUEST_NAME = h.a("request_name");
        public static final h HTTP_CODE = h.a("http_code");
        public static final h API_STATUS = h.a("api_status");

        private Tags() {
        }
    }

    public static void registerAllViews(q qVar) {
        p[] pVarArr = {Views.REQUEST_COUNT, Views.REQUEST_LATENCY, Views.NETWORK_LATENCY, Views.RETRY_COUNT};
        for (int i10 = 0; i10 < 4; i10++) {
            qVar.a(pVarArr[i10]);
        }
    }

    private OpenCensusMetrics() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<h> tags(h... hVarArr) {
        return Collections.unmodifiableList(Arrays.asList(hVarArr));
    }
}
