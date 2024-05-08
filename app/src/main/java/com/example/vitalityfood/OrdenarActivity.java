package com.example.vitalityfood;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OrdenarActivity extends AppCompatActivity {
    private int counter = 0,counter2 = 0,counter3 = 0,counter4 = 0,counter5 = 0,counter6 = 0,counter7 = 0,counter8 = 0,counter9 = 0,counter10 = 0,counter11 = 0,counter12 = 0,counter13 = 0,counter14 = 0;
    private TextView tvCounter,tvCounter2,tvCounter3,tvCounter4,tvCounter5,tvCounter6,tvCounter7,tvCounter8,tvCounter9,tvCounter10,tvCounter11,tvCounter12,tvCounter13,tvCounter14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ordenar_layout);

        Button btnIncrement = findViewById(R.id.btnIncrement);
        Button btnDecrement = findViewById(R.id.btnDecrement);
        tvCounter = findViewById(R.id.tvCounter);

        Button btnIncrement2 = findViewById(R.id.btnIncrement2);
        Button btnDecrement2 = findViewById(R.id.btnDecrement2);
        tvCounter2 = findViewById(R.id.tvCounter2);

        Button btnIncrement3 = findViewById(R.id.btnIncrement3);
        Button btnDecrement3 = findViewById(R.id.btnDecrement3);
        tvCounter3 = findViewById(R.id.tvCounter3);

        Button btnIncrement4 = findViewById(R.id.btnIncrement4);
        Button btnDecrement4 = findViewById(R.id.btnDecrement4);
        tvCounter4 = findViewById(R.id.tvCounter4);

        Button btnIncrement5 = findViewById(R.id.btnIncrement5);
        Button btnDecrement5 = findViewById(R.id.btnDecrement5);
        tvCounter5 = findViewById(R.id.tvCounter5);

        Button btnIncrement6 = findViewById(R.id.btnIncrement6);
        Button btnDecrement6 = findViewById(R.id.btnDecrement6);
        tvCounter6 = findViewById(R.id.tvCounter6);

        Button btnIncrement7 = findViewById(R.id.btnIncrement7);
        Button btnDecrement7 = findViewById(R.id.btnDecrement7);
        tvCounter7 = findViewById(R.id.tvCounter7);

        Button btnIncrement8 = findViewById(R.id.btnIncrement8);
        Button btnDecrement8 = findViewById(R.id.btnDecrement8);
        tvCounter8 = findViewById(R.id.tvCounter8);

        Button btnIncrement9 = findViewById(R.id.btnIncrement9);
        Button btnDecrement9 = findViewById(R.id.btnDecrement9);
        tvCounter9 = findViewById(R.id.tvCounter9);

        Button btnIncrement10 = findViewById(R.id.btnIncrement10);
        Button btnDecrement10 = findViewById(R.id.btnDecrement10);
        tvCounter10 = findViewById(R.id.tvCounter10);

        Button btnIncrement11 = findViewById(R.id.btnIncrement11);
        Button btnDecrement11 = findViewById(R.id.btnDecrement11);
        tvCounter11 = findViewById(R.id.tvCounter11);

        Button btnIncrement12 = findViewById(R.id.btnIncrement12);
        Button btnDecrement12 = findViewById(R.id.btnDecrement12);
        tvCounter12 = findViewById(R.id.tvCounter12);

        Button btnIncrement13 = findViewById(R.id.btnIncrement13);
        Button btnDecrement13 = findViewById(R.id.btnDecrement13);
        tvCounter13 = findViewById(R.id.tvCounter13);

        Button btnIncrement14 = findViewById(R.id.btnIncrement14);
        Button btnDecrement14 = findViewById(R.id.btnDecrement14);
        tvCounter14 = findViewById(R.id.tvCounter14);

        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                tvCounter.setText(String.valueOf(counter));
            }
        });
        btnDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter > 0) {
                    counter--;
                    tvCounter.setText(String.valueOf(counter));
                }
            }
        });

        btnIncrement2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter2++;
                tvCounter2.setText(String.valueOf(counter2));
            }
        });
        btnDecrement2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter2 > 0) {
                    counter2--;
                    tvCounter2.setText(String.valueOf(counter2));
                }
            }
        });

        btnIncrement3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter3++;
                tvCounter3.setText(String.valueOf(counter3));
            }
        });
        btnDecrement3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter3 > 0) {
                    counter3--;
                    tvCounter3.setText(String.valueOf(counter3));
                }
            }
        });

        btnIncrement4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter4++;
                tvCounter4.setText(String.valueOf(counter4));
            }
        });
        btnDecrement4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter4 > 0) {
                    counter4--;
                    tvCounter4.setText(String.valueOf(counter4));
                }
            }
        });

        btnIncrement5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter5++;
                tvCounter5.setText(String.valueOf(counter5));
            }
        });
        btnDecrement5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter5 > 0) {
                    counter5--;
                    tvCounter5.setText(String.valueOf(counter5));
                }
            }
        });

        btnIncrement6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter6++;
                tvCounter6.setText(String.valueOf(counter6));
            }
        });
        btnDecrement6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter6 > 0) {
                    counter6--;
                    tvCounter6.setText(String.valueOf(counter6));
                }
            }
        });

        btnIncrement7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter7++;
                tvCounter7.setText(String.valueOf(counter7));
            }
        });
        btnDecrement7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter7 > 0) {
                    counter7--;
                    tvCounter7.setText(String.valueOf(counter7));
                }
            }
        });

        btnIncrement8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter8++;
                tvCounter8.setText(String.valueOf(counter8));
            }
        });
        btnDecrement8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter8 > 0) {
                    counter8--;
                    tvCounter8.setText(String.valueOf(counter8));
                }
            }
        });

        btnIncrement9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter9++;
                tvCounter9.setText(String.valueOf(counter9));
            }
        });
        btnDecrement9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter9 > 0) {
                    counter9--;
                    tvCounter9.setText(String.valueOf(counter9));
                }
            }
        });

        btnIncrement10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter10++;
                tvCounter10.setText(String.valueOf(counter10));
            }
        });
        btnDecrement10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter10 > 0) {
                    counter10--;
                    tvCounter10.setText(String.valueOf(counter10));
                }
            }
        });

        btnIncrement11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter11++;
                tvCounter11.setText(String.valueOf(counter11));
            }
        });
        btnDecrement11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter11 > 0) {
                    counter11--;
                    tvCounter11.setText(String.valueOf(counter11));
                }
            }
        });

        btnIncrement12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter12++;
                tvCounter12.setText(String.valueOf(counter12));
            }
        });
        btnDecrement12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter12 > 0) {
                    counter12--;
                    tvCounter12.setText(String.valueOf(counter12));
                }
            }
        });

        btnIncrement13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter13++;
                tvCounter13.setText(String.valueOf(counter13));
            }
        });
        btnDecrement13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter13 > 0) {
                    counter13--;
                    tvCounter13.setText(String.valueOf(counter13));
                }
            }
        });

        btnIncrement14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter14++;
                tvCounter14.setText(String.valueOf(counter14));
            }
        });
        btnDecrement14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter14 > 0) {
                    counter14--;
                    tvCounter14.setText(String.valueOf(counter14));
                }
            }
        });


    }
}
