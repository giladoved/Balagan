package com.balagan.game;

import java.util.ArrayList;
import java.util.Collections;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Main extends Activity implements OnClickListener {

	Button[] letter = new Button[22];
	String[] letterConsts = { "א", "ב", "ג", "ד", "ה", "ו", "ז", "ח", "ט", "י",
			"כ", "ל", "מ", "נ", "ס", "ע", "פ", "צ", "ק", "ר", "ש", "ת" };
	ArrayList<String> listOfLetters;
	String guess = "";
	TextView listLabel;
	int guesses = 0;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		setVolumeControlStream(AudioManager.STREAM_MUSIC);

		listOfLetters = new ArrayList<String>();
		for (int i = 0; i < letterConsts.length; i++) {
			listOfLetters.add(letterConsts[i]);
		}

		Collections.shuffle(listOfLetters);

		listLabel = (TextView) findViewById(R.id.lblList);

		letter[0] = (Button) findViewById(R.id.Button1);
		letter[1] = (Button) findViewById(R.id.Button2);
		letter[2] = (Button) findViewById(R.id.Button3);
		letter[3] = (Button) findViewById(R.id.Button4);
		letter[4] = (Button) findViewById(R.id.Button5);
		letter[5] = (Button) findViewById(R.id.Button6);
		letter[6] = (Button) findViewById(R.id.Button7);
		letter[7] = (Button) findViewById(R.id.Button8);
		letter[8] = (Button) findViewById(R.id.Button9);
		letter[9] = (Button) findViewById(R.id.Button10);
		letter[10] = (Button) findViewById(R.id.Button11);
		letter[11] = (Button) findViewById(R.id.Button12);
		letter[12] = (Button) findViewById(R.id.Button13);
		letter[13] = (Button) findViewById(R.id.Button14);
		letter[14] = (Button) findViewById(R.id.Button15);
		letter[15] = (Button) findViewById(R.id.Button16);
		letter[16] = (Button) findViewById(R.id.Button17);
		letter[17] = (Button) findViewById(R.id.Button18);
		letter[18] = (Button) findViewById(R.id.Button19);
		letter[19] = (Button) findViewById(R.id.Button20);
		letter[20] = (Button) findViewById(R.id.Button21);
		letter[21] = (Button) findViewById(R.id.Button22);

		for (int i = 0; i < 22; i++) {
			letter[i].setText(listOfLetters.get(i));
			letter[i].setOnClickListener(this);
		}
	}

	public void NewRound() {
		guess = "";
		guesses = 0;
		Collections.shuffle(listOfLetters);
		for (int i = 0; i < 22; i++){
			letter[i].setText(listOfLetters.get(i));
			letter[i].setVisibility(View.VISIBLE);
		}
		listLabel.setText("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.Button1:
			if (letterConsts[guesses] == listOfLetters.get(0)) {
				guesses++;
				guess += listOfLetters.get(0);
				listLabel.setText(guess);
				letter[0].setVisibility(View.INVISIBLE);
			} else {
				PlaySound(R.raw.beep);
			}
			break;
		case R.id.Button2:
			if (letterConsts[guesses] == listOfLetters.get(1)) {
				guesses++;
				guess += listOfLetters.get(1);
				listLabel.setText(guess);
				letter[1].setVisibility(View.INVISIBLE);
			} else {
				PlaySound(R.raw.beep);
			}
			break;
		case R.id.Button3:
			if (letterConsts[guesses] == listOfLetters.get(2)) {
				guesses++;
				guess += listOfLetters.get(2);
				listLabel.setText(guess);
				letter[2].setVisibility(View.INVISIBLE);
			} else {
				PlaySound(R.raw.beep);
			}
			break;
		case R.id.Button4:
			if (letterConsts[guesses] == listOfLetters.get(3)) {
				guesses++;
				guess += listOfLetters.get(3);
				listLabel.setText(guess);
				letter[3].setVisibility(View.INVISIBLE);
			} else {
				PlaySound(R.raw.beep);
			}
			break;
		case R.id.Button5:
			if (letterConsts[guesses] == listOfLetters.get(4)) {
				guesses++;
				guess += listOfLetters.get(4);
				listLabel.setText(guess);
				letter[4].setVisibility(View.INVISIBLE);
			} else {
				PlaySound(R.raw.beep);
			}
			break;
		case R.id.Button6:
			if (letterConsts[guesses] == listOfLetters.get(5)) {
				guesses++;
				guess += listOfLetters.get(5);
				listLabel.setText(guess);
				letter[5].setVisibility(View.INVISIBLE);
			} else {
				PlaySound(R.raw.beep);
			}
			break;
		case R.id.Button7:
			if (letterConsts[guesses] == listOfLetters.get(6)) {
				guesses++;
				guess += listOfLetters.get(6);
				listLabel.setText(guess);
				letter[6].setVisibility(View.INVISIBLE);
			} else {
				PlaySound(R.raw.beep);
			}
			break;
		case R.id.Button8:
			if (letterConsts[guesses] == listOfLetters.get(7)) {
				guesses++;
				guess += listOfLetters.get(7);
				listLabel.setText(guess);
				letter[7].setVisibility(View.INVISIBLE);
			} else {
				PlaySound(R.raw.beep);
			}
			break;
		case R.id.Button9:
			if (letterConsts[guesses] == listOfLetters.get(8)) {
				guesses++;
				guess += listOfLetters.get(8);
				listLabel.setText(guess);
				letter[8].setVisibility(View.INVISIBLE);
			} else {
				PlaySound(R.raw.beep);
			}
			break;
		case R.id.Button10:
			if (letterConsts[guesses] == listOfLetters.get(9)) {
				guesses++;
				guess += listOfLetters.get(9);
				listLabel.setText(guess);
				letter[9].setVisibility(View.INVISIBLE);
			} else {
				PlaySound(R.raw.beep);
			}
			break;
		case R.id.Button11:
			if (letterConsts[guesses] == listOfLetters.get(10)) {
				guesses++;
				guess += listOfLetters.get(10);
				listLabel.setText(guess);
				letter[10].setVisibility(View.INVISIBLE);
			} else {
				PlaySound(R.raw.beep);
			}
			break;
		case R.id.Button12:
			if (letterConsts[guesses] == listOfLetters.get(11)) {
				guesses++;
				guess += listOfLetters.get(11);
				listLabel.setText(guess);
				letter[11].setVisibility(View.INVISIBLE);
			} else {
				PlaySound(R.raw.beep);
			}
			break;
		case R.id.Button13:
			if (letterConsts[guesses] == listOfLetters.get(12)) {
				guesses++;
				guess += listOfLetters.get(12);
				listLabel.setText(guess);
				letter[12].setVisibility(View.INVISIBLE);
			} else {
				PlaySound(R.raw.beep);
			}
			break;
		case R.id.Button14:
			if (letterConsts[guesses] == listOfLetters.get(13)) {
				guesses++;
				guess += listOfLetters.get(13);
				listLabel.setText(guess);
				letter[13].setVisibility(View.INVISIBLE);
			} else {
				PlaySound(R.raw.beep);
			}
			break;
		case R.id.Button15:
			if (letterConsts[guesses] == listOfLetters.get(14)) {
				guesses++;
				guess += listOfLetters.get(14);
				listLabel.setText(guess);
				letter[14].setVisibility(View.INVISIBLE);
			} else {
				PlaySound(R.raw.beep);
			}
			break;
		case R.id.Button16:
			if (letterConsts[guesses] == listOfLetters.get(15)) {
				guesses++;
				guess += listOfLetters.get(15);
				listLabel.setText(guess);
				letter[15].setVisibility(View.INVISIBLE);
			} else {
				PlaySound(R.raw.beep);
			}
			break;
		case R.id.Button17:
			if (letterConsts[guesses] == listOfLetters.get(16)) {
				guesses++;
				guess += listOfLetters.get(16);
				listLabel.setText(guess);
				letter[16].setVisibility(View.INVISIBLE);
			} else {
				PlaySound(R.raw.beep);
			}
			break;
		case R.id.Button18:
			if (letterConsts[guesses] == listOfLetters.get(17)) {
				guesses++;
				guess += listOfLetters.get(17);
				listLabel.setText(guess);
				letter[17].setVisibility(View.INVISIBLE);
			} else {
				PlaySound(R.raw.beep);
			}
			break;
		case R.id.Button19:
			if (letterConsts[guesses] == listOfLetters.get(18)) {
				guesses++;
				guess += listOfLetters.get(18);
				listLabel.setText(guess);
				letter[18].setVisibility(View.INVISIBLE);
			} else {
				PlaySound(R.raw.beep);
			}
			break;
		case R.id.Button20:
			if (letterConsts[guesses] == listOfLetters.get(19)) {
				guesses++;
				guess += listOfLetters.get(19);
				listLabel.setText(guess);
				letter[19].setVisibility(View.INVISIBLE);
			} else {
				PlaySound(R.raw.beep);
			}
			break;
		case R.id.Button21:
			if (letterConsts[guesses] == listOfLetters.get(20)) {
				guesses++;
				guess += listOfLetters.get(20);
				listLabel.setText(guess);
				letter[20].setVisibility(View.INVISIBLE);
			} else {
				PlaySound(R.raw.beep);
			}
			break;
		case R.id.Button22:
			if (letterConsts[guesses] == listOfLetters.get(21)) {
				guesses++;
				guess += listOfLetters.get(21);
				listLabel.setText(guess);
				letter[21].setVisibility(View.INVISIBLE);
			} else {
				PlaySound(R.raw.beep);
			}
			break;
		}
		if (guesses > 21) {
			int count = 0;
			for (int i = 0; i < letterConsts.length; i++) {
				if (guess.substring(i, i + 1).equals(letterConsts[i])) {
					count++;
				}
			}
			if (count > 21) {
				AskForPlayAgain();
			} 
		}
	}

	public void AskForPlayAgain() {
		DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				switch (which) {
				case DialogInterface.BUTTON_POSITIVE:
					NewRound();
					break;

				case DialogInterface.BUTTON_NEGATIVE:
					finish();
					break;
				}
			}
		};

		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("!נהדר" + 
				"\n\n" + "?משחק חדש")
				.setPositiveButton("כן", dialogClickListener)
				.setNegativeButton("לא", dialogClickListener).show();
	}

	public void PlaySound(int sound) {
		MediaPlayer mp = MediaPlayer.create(getBaseContext(),
                sound);
        mp.start();
        mp.setOnCompletionListener(new OnCompletionListener() {

            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
	}

	public void onExitAction() {
		finish();
	}

	public void onUserLeaveHint() {
		finish();
	}

	protected void onDestroy() {
		super.onDestroy();
		int pid = android.os.Process.myPid();
		android.os.Process.killProcess(pid);
	}

}