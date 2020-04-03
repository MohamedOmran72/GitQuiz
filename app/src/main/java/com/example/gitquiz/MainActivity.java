package com.example.gitquiz;

import android.os.Build;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text_name)
    EditText textName;
    @BindView(R.id.radio_question_1_answer_a)
    RadioButton radioQuestion1AnswerA;
    @BindView(R.id.radio_question_1_answer_b)
    RadioButton radioQuestion1AnswerB;
    @BindView(R.id.radio_question_1_answer_c)
    RadioButton radioQuestion1AnswerC;
    @BindView(R.id.radio_question_1_answer_d)
    RadioButton radioQuestion1AnswerD;
    @BindView(R.id.radio_question_2_answer_a)
    RadioButton radioQuestion2AnswerA;
    @BindView(R.id.radio_question_2_answer_b)
    RadioButton radioQuestion2AnswerB;
    @BindView(R.id.radio_question_2_answer_c)
    RadioButton radioQuestion2AnswerC;
    @BindView(R.id.radio_question_2_answer_d)
    RadioButton radioQuestion2AnswerD;
    @BindView(R.id.radio_question_3_answer_a)
    RadioButton radioQuestion3AnswerA;
    @BindView(R.id.radio_question_3_answer_b)
    RadioButton radioQuestion3AnswerB;
    @BindView(R.id.radio_question_3_answer_c)
    RadioButton radioQuestion3AnswerC;
    @BindView(R.id.radio_question_3_answer_d)
    RadioButton radioQuestion3AnswerD;
    @BindView(R.id.radio_question_4_answer_a)
    RadioButton radioQuestion4AnswerA;
    @BindView(R.id.radio_question_4_answer_b)
    RadioButton radioQuestion4AnswerB;
    @BindView(R.id.radio_question_4_answer_c)
    RadioButton radioQuestion4AnswerC;
    @BindView(R.id.radio_question_4_answer_d)
    RadioButton radioQuestion4AnswerD;
    @BindView(R.id.check_question_5_answer_a)
    CheckBox checkQuestion5AnswerA;
    @BindView(R.id.check_question_5_answer_b)
    CheckBox checkQuestion5AnswerB;
    @BindView(R.id.check_question_5_answer_c)
    CheckBox checkQuestion5AnswerC;
    @BindView(R.id.check_question_5_answer_d)
    CheckBox checkQuestion5AnswerD;
    @BindView(R.id.text_question_1)
    TextView textQuestion1;
    @BindView(R.id.text_question_2)
    TextView textQuestion2;
    @BindView(R.id.text_question_3)
    TextView textQuestion3;
    @BindView(R.id.text_question_4)
    TextView textQuestion4;
    @BindView(R.id.text_question_5)
    TextView textQuestion5;

    private int mScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @RequiresApi(api = Build.VERSION_CODES.M)
    @OnClick(R.id.button_submit)
    public void onViewClicked() {
        if (radioQuestion1AnswerB.isChecked()) {
            mScore++;
            textQuestion1.setError(null);
        } else {
            textQuestion1.setError(getString(R.string.error_massage));
        }

        if (radioQuestion2AnswerA.isChecked()) {
            mScore++;
            textQuestion2.setError(null);
        } else {
            textQuestion2.setError(getString(R.string.error_massage));
        }

        if (radioQuestion3AnswerB.isChecked()) {
            mScore++;
            textQuestion3.setError(null);
        } else {
            textQuestion3.setError(getString(R.string.error_massage));
        }

        if (radioQuestion4AnswerB.isChecked()) {
            mScore++;
            textQuestion4.setError(null);
        } else {
            textQuestion4.setError(getString(R.string.error_massage));
        }

        if (checkQuestion5AnswerA.isChecked() && checkQuestion5AnswerB.isChecked() &&
                !checkQuestion5AnswerC.isChecked() & !checkQuestion5AnswerD.isChecked()) {
            mScore++;
            textQuestion5.setError(null);
        } else {
            textQuestion5.setError(getString(R.string.error_massage));
        }

        Toast.makeText(this, String.format(getString(R.string.toast_massage), textName.getText(), mScore)
                , Toast.LENGTH_SHORT).show();
        mScore = 0;
    }
}
