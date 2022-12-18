package com.example.moralebooster;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.moralebooster.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        MessageStats messageStats = MessageDB.getNextRandomMessage();
        String stats = String.format("[%d, %,.0f%%]", messageStats.getScore(), messageStats.getPercentage());

        System.out.println(String.format("Message %s: %s", stats, messageStats.getMessage()));

        TextView text = view.findViewById(R.id.textview_first);
        text.setText(messageStats.getMessage() + "\n\n"+ stats);

        binding.buttonFirst.setOnClickListener(view1 -> NavHostFragment.findNavController(FirstFragment.this)
                .navigate(R.id.action_FirstFragment_Next));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}