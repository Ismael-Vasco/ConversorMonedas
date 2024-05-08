package modelos;

public record Moneda(String result,                 //"success"
                     String documentation,          //"https://www.exchangerate-api.com/docs"
                     String terms_of_use,           // "https://www.exchangerate-api.com/terms"
                     int time_last_update_unix,     // 171469440
                     String time_last_update_utc,   //"Fri, 03 May 2024 00:00:01 +0000"
                     int time_next_update_unix,     // 1714780801
                     String time_next_update_utc,   // "Sat, 04 May 2024 00:00:01 +0000"
                     String base_code,              // "COP"
                     String target_code,            // "USD"
                     Double conversion_rate,        // 0.00025658
                     Double conversion_result){     // 1.000023551986
}
